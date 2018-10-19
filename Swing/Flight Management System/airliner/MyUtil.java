/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airliner;

import java.io.*;

/**
 *
 * @author zhiyongzhang
 */
public class MyUtil {

    public static <E> void objectWrite(E e, File file) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(e);
            oos.flush();
            oos.close();
        } catch (Exception ex) {

        }
    }

    public static <E> E objectRead(E e, File file) {
        if (0 != file.length()) {
            try {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
                e = (E) ois.readObject();
                ois.close();
            } catch (Exception ex) {

            }
        }
        return e;
    }

}
