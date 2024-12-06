# Shutdown-Scheduler
The Shutdown Scheduler is a Java-based desktop application that allows users to schedule a system shutdown at a specific time. With a simple graphical user interface (GUI), users can input the desired shutdown time, and the app will automatically shut down the system when the specified time is reached.


#Features

    User-Friendly Interface: Input the shutdown time using an intuitive GUI.
    Time Validation: Ensures the input time is valid (e.g., hour between 0–23, minute between 0–59).
    Automated Shutdown: Executes the shutdown command at the specified time.
    Real-Time Monitoring: Continuously checks the system clock to match the scheduled time.



#Requirements

    Java Version: Java SE 8 or later.
    Operating System:
        Windows (supports shutdown command).
        Note: Linux and macOS may require alternate shutdown commands.
    Permissions: Administrator privileges may be required to execute the shutdown command.

#How to Use

    Launch the App:
        Compile and run the application using javac and java.
        Example:

    javac App.java
    java App

      Enter the Shutdown Time:
      
          In the GUI, input the desired shutdown time in the Hour and Minute fields (24-hour format).
      
      Set Shutdown:
      
          Click the Set Shutdown Time button.
      
      Confirmation:
      
          The app will display a message indicating the scheduled shutdown time.
      
      Wait for Shutdown:
      
          The system will automatically shut down at the specified time.

#Future Improvements

    Support for different operating systems (Linux, macOS).
    Add a cancel button in the GUI to abort the shutdown.
    Allow users to set additional options, such as a restart instead of a shutdown.
