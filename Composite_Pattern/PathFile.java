/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composite_Pattern;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public abstract class PathFile {
    public String name, path, preStr;

    public PathFile(String name, String path, String preStr) {
        this.name = name;
        this.path = path;
        this.preStr = preStr;
    }
    public abstract void remove(PathFile pfile);
    public abstract void addItem(PathFile pfile);
    public abstract String getStringTreeFolder();
    public String path(){
        return path;
    }

    
    
}
