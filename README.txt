This is an assembly kit for your final deployment.

This is a *requirement* for the presentation - 
you need to know how to build a deployable / runtime artifact (JAR).

You will run your demo from a command prompt, outside the IDE, using the application JAR.

Included in this package is a complete kit for my 'blackjack' demo application.
It includes build and run scripts, as well as the application code and resource files for blackjack.

Scripts:
  build -> compiles application code, builds JAR, generates Javadoc (optional)
  run   -> runs application

I've provided pairs of scripts for Windows (.cmd) and unix (.sh), which includes macOS.
These scripts are run *outside* the IDE, i.e., at a command prompt.

STEPS
0. Build and run the blackjack application included in this kit, so you see how it works.
   The provided build and run scripts are preconfigured for this blackjack application,
   so you don't need to modify them.  (You *will* need to modify them for your application.)

1. Create a staging area for your project, *away* from IntelliJ.
   Perhaps C:\StudentWork\MiniProject\STAGE\blackjack

2. Copy the appropriate build and run scripts (.cmd or .sh) to that location.

3. Copy select items from your project directory into the staging area.
    src/       source tree                        [test code not needed,  this is a product build]
    lib/       third-party library JARs (if any)  [JUnit JARs not needed, this is a product build]
    other/     other files or folders used by your application (if any), e.g., a 'config' folder, etc.
  
   Note that it is entirely possible that all you have is:
    src/       perfectly fine if you don't use any external libraries or have any subfolders

4. Open a command prompt in this staging directory.
   Read the comments in both scripts and adjust to your needs.

5. Once you have it built and running successfully, you can trim away unneeded files:
    build script
    src/
    classes/   

Final note: this process is normally done via build tools such as Maven or Gradle, but we're not
using those at this point, and besides, you should see how it's done with the bare metal JDK tools anyway.