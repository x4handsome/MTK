/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composite_Pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class Folder extends PathFile{
    List<PathFile> children = new ArrayList();

    public Folder(String name, String path, String preStr) {
        super(name, path, preStr);
    }
    
    @Override
    public void remove(PathFile pfile) {
        if(children.contains(pfile))
            {
                children.remove(pfile);
                return;
            }
//        for (PathFile folder: children)
//            folder.remove(pfile);
    }

    @Override
    public void addItem(PathFile pfile) {
        if(!children.contains(pfile))
            {
                children.add(pfile);
                pfile.path = this.path +"\\"+ pfile.path;
            }
    }

    @Override
    public String getStringTreeFolder() {
        StringBuilder builder = new StringBuilder();
        builder.append(preStr).
                append(name);
        for (PathFile f : children)  {
            f.preStr = this.preStr + "..";
            builder.append("\n")
                    .append(f.getStringTreeFolder());
            f.preStr = "";
            
        }
        return builder.toString();
    }
}
