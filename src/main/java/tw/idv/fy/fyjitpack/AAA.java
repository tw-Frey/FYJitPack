package tw.idv.fy.fyjitpack;

import tw.idv.fy.JarWrapperLibrary.MyClass;
import tw.idv.fy.javalibrary.FYClass;

public class AAA extends FYClass {
    static {
        FYClass.main(null);
    }
    void main(){
        AAA.main(new String[]{String.valueOf(new MyClass())});
    }
}
