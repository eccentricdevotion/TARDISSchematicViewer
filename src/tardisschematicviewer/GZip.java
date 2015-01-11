/*
 *  Copyright 2014 eccentric_nz.
 */
package tardisschematicviewer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author eccentric_nz
 */
public class GZip {

    public static void zip(String instr, String outstr) {
        try {
            try (FileInputStream fis = new FileInputStream(instr); FileOutputStream fos = new FileOutputStream(outstr); GZIPOutputStream gzos = new GZIPOutputStream(fos)) {
                byte[] buffer = new byte[1024 * 16];
                int len;
                while ((len = fis.read(buffer)) != -1) {
                    gzos.write(buffer, 0, len);
                }
            }
        } catch (IOException e) {
            Logger.getLogger(TARDISSchematicViewer.class.getName()).log(Level.SEVERE, e.getMessage());
        }
    }

    public static JSONObject unzip(String instr) {
        InputStreamReader isr = null;
        StringWriter sw = null;
        String s = "";
        try {
            GZIPInputStream gzis = new GZIPInputStream(new FileInputStream(instr));
            isr = new InputStreamReader(gzis, "UTF-8");
            sw = new StringWriter();
            char[] buffer = new char[1024 * 16];
            int len;
            while ((len = isr.read(buffer)) > 0) {
                sw.write(buffer, 0, len);
            }
            s = sw.toString();
        } catch (IOException ex) {
            Logger.getLogger(TARDISSchematicViewer.class.getName()).log(Level.SEVERE, ex.getMessage());
        } finally {
            try {
                if (sw != null) {
                    sw.close();
                }
                if (isr != null) {
                    isr.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(TARDISSchematicViewer.class.getName()).log(Level.SEVERE, ex.getMessage());
            }
        }
        return (s.startsWith("{")) ? new JSONObject(s) : null;
    }
}
