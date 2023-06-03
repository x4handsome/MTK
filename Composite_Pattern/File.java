/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composite_Pattern;

/**
 *
 * @author Nguyen Quoc Chau IT
 */
public class File extends PathFile{

    public File(String name, String path, String preStr) {
        super(name, path, preStr);
    }

    
    @Override
    public void remove(PathFile pfile) {
    }

    @Override
    public void addItem(PathFile pfile) {
    }

    @Override
    public String getStringTreeFolder() {
        return this.preStr +name;
    }
        
}
