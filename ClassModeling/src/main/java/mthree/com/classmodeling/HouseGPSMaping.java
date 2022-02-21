
package mthree.com.classmodeling;

import java.io.File;

/**
 *
 * @author ta
 */
public class HouseGPSMaping {
    private String address;
    private File photo;
    public HouseGPSMaping(){}
    public HouseGPSMaping(String addr){
        this.address=addr;
    }
    public HouseGPSMaping(String addr, File photoFile){
        this.address=addr;
        this.photo=photoFile;
    }
    
    public void setAddress(String addr){
        this.address=addr;
    }
    
    public String getAddress(){
        return address;
    }
    public void setPhoto(File photoFile){
        this.photo=photoFile;
    }
    
    public File getPhoto(){
        return photo;
    }
    
}
