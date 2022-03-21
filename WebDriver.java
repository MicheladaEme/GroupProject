package com.syntax.groupProjects;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface TakesScreenshot{
    void getScreenshot();
}
interface RemoteWebDriver{
    void navigate();
}
class ChromeDriver implements WebDriver, TakesScreenshot, RemoteWebDriver{
    public void open(){
        System.out.println("Open Chrome browser");
    };
    public void close(){
        System.out.println("Close Chrome browser");
    };
    public String getTitle(){
        return "Chrome";
    };
    public void getScreenshot(){
        System.out.println("Launch Google Chrome on Windows. " +
                "On your keyboard, hit ctrl + shift + I to open the developer mode. " +
                "Next, hit ctrl + shift + P to invoke various built-in command tools. " +
                "Search for term screenshot in the field. " +
                "Select the appropriate screenshot action like Capture full size screenshot.");
    };
    public void navigate(){
        System.out.println("Navigate to Chrome browser");
    };
}
class FirefoxDriver implements WebDriver, TakesScreenshot, RemoteWebDriver{
    public void open(){
        System.out.println("Open Firefox browser");
    };
    public void close(){
        System.out.println("Close Firefox browser");
    };
    public String getTitle(){
        return "Firefox";
    };
    public void getScreenshot(){
        System.out.println("Right-click on an empty part of the page and select Take Screenshot.");
    };
    public void navigate(){
        System.out.println("Navigate to Firefox browser");
    };
}
class SafariDriver implements WebDriver, TakesScreenshot, RemoteWebDriver{
    public void open(){
        System.out.println("Open Safari browser");
    };
    public void close(){
        System.out.println("Close Safari browser");
    };
    public String getTitle(){
        return "Safari";
    };
    public void getScreenshot(){
        System.out.println("To take a screenshot, press and hold these three keys together: Shift, Command, and 3.");
    };
    public void navigate(){
        System.out.println("Navigate to Safari browser");
    };
}
