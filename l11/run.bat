set PATH_TO_FX="C:\javafx-sdk-15.0.1\lib"
javac --module-path %PATH_TO_FX% --add-modules javafx.controls MainPaneFX.java GraphPanelFX.java Function.java OptimizerDriverFX.java OptimizerManager.java OptimizerManagerInterface.java Optimum.java Function1.java Function2.java
java --module-path %PATH_TO_FX% --add-modules javafx.controls -cp c:\Users\fvman\Downloads\l11\l11 OptimizerDriverFX
timeout /t -1
