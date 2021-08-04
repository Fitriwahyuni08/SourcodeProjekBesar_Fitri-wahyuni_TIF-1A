
package perancanganaplikasi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.JFrame;


public class Playlist {
    JFileChooser fc = new JFileChooser();
    ArrayList ls = new ArrayList();
    
    void add(JFrame frame){
        fc.setMultiSelectionEnabled(true);
        int fileValid = fc.showOpenDialog(frame);
        if(fileValid  == javax.swing.JFileChooser.CANCEL_OPTION){
            return;
        } else if (fileValid  == javax.swing.JFileChooser.APPROVE_OPTION){
            File [] file = fc.getSelectedFiles();
            ls.addAll(Arrays.asList(file));
        }
    }
    
    ArrayList getListSong(){
     return ls;
    }
    
    //save playlist
    FileOutputStream fos;
    ObjectOutputStream oos;
    
    public void saveAsPlaylist(JFrame frema){
        fc.setMultiSelectionEnabled(false);
        int Valid =fc.showSaveDialog(frema);
        if (Valid == javax.swing.JFileChooser.CANCEL_OPTION){
            return;
        } else if (Valid == javax.swing.JFileChooser.APPROVE_OPTION){
            File pls = fc.getSelectedFile();
            try {
                fos = new FileOutputStream(pls + ".tgr");
                oos = new ObjectOutputStream(fos);
                for(int  i=0; i<ls.size(); i++){
                    File tmp = (File) ls.get(i);
                    oos.writeObject(tmp);
                }
                oos.close();
            }
            catch (Exception e){
        }
    }
}
    FileInputStream fis;
    ObjectInputStream ols;
    
    public void openPls(JFrame frame){
         fc.setMultiSelectionEnabled(false);
        int Valid =fc.showOpenDialog(frame);
        if (Valid == javax.swing.JFileChooser.CANCEL_OPTION){
            return;
        }
        if (Valid == javax.swing.JFileChooser.APPROVE_OPTION){
            File pls = fc.getSelectedFile();
            try {
                fis = new FileInputStream(pls);
                 ols = new ObjectInputStream(fis);
                 File tmp;
                 while ((tmp = (File) ols.readObject()) != null){
                     ls.add(tmp);
                 }
                if ((tmp = (File) ols.readObject()) == null){
                    ls.isEmpty();
                }
                ols.close();
            } catch (Exception e){
            }
        }
    }
}