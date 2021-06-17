/*
 * Copyright (C) 2021 eccentric_nz
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package me.eccentric_nz.tardisschematicviewer;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * @author eccentric_nz
 */
public class GZip {

    public static void zip(String inString, String outString) {
        try {
            try (FileInputStream fileInputStream = new FileInputStream(inString); FileOutputStream fileOutputStream = new FileOutputStream(outString); GZIPOutputStream gzipOutputStream = new GZIPOutputStream(fileOutputStream)) {
                byte[] buffer = new byte[1024 * 16];
                int len;
                while ((len = fileInputStream.read(buffer)) != -1) {
                    gzipOutputStream.write(buffer, 0, len);
                }
            }
        } catch (IOException e) {
            Logger.getLogger(TardisSchematicViewer.class.getName()).log(Level.SEVERE, e.getMessage());
        }
    }

    public static JsonObject unzip(String inString) {
        InputStreamReader inputStreamReader = null;
        StringWriter stringWriter = null;
        String string = "";
        try {
            GZIPInputStream gzipInputStream = new GZIPInputStream(new FileInputStream(inString));
            inputStreamReader = new InputStreamReader(gzipInputStream, StandardCharsets.UTF_8);
            stringWriter = new StringWriter();
            char[] buffer = new char[1024 * 16];
            int len;
            while ((len = inputStreamReader.read(buffer)) > 0) {
                stringWriter.write(buffer, 0, len);
            }
            string = stringWriter.toString();
        } catch (IOException e) {
            Logger.getLogger(TardisSchematicViewer.class.getName()).log(Level.SEVERE, e.getMessage());
        } finally {
            try {
                if (stringWriter != null) {
                    stringWriter.close();
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
            } catch (IOException e) {
                Logger.getLogger(TardisSchematicViewer.class.getName()).log(Level.SEVERE, e.getMessage());
            }
        }
        return (string.startsWith("{")) ? new JsonObject(string) : null;
    }
}
