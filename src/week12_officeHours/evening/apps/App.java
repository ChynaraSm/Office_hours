package week12_officeHours.evening.apps;

public class App {
    /*
    App [inheritance, constructors]
    Create an App class
        - create variables:
            name (app name), version
        - create a constructor to initialize the variables
        - create method:
            download()
                Example output: prints $name is downloading version $version
     */

    String name;
    double version;

    public App(String name,double version){
        this.name = name;
        this.version = version;
    }
    public App(double version){
        this.name = getClass().getSimpleName();
        this.version = version;
    }
    public void download(){
        System.out.println(getClass().getSimpleName() + " is downloading version " + version);
    }

}
