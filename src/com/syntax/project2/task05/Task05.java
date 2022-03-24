package com.syntax.project2.task05;

public class Task05 {
}
interface WebDriver{
    void open();
    void close();
    String getTitle();
}
interface RemoteWebDriver extends WebDriver {
    void navigate();
}
interface TakesScreenshot extends RemoteWebDriver{
    void getScreenshot();
}


