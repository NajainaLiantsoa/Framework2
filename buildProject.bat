@echo off
cls

REM classpath 
set CLASSPATH=%CLASSPATH%;D:\S3-S4\S4\Mr Naina\FRAMWORK\fw.jar

REM Déclaration des variables de chemin
REM chemin du projet
set "project=D:\S3-S4\S4\Mr Naina\FRAMWORK\Test-Framework"

REM nom du projet dans le deploiement
set "name=TFW"

REM chemin du .jar du framework
set "fw=D:\S3-S4\S4\Mr Naina\FRAMWORK\fw.jara"

REM chemin vers le repertoire webapps de tomcat
set "deploy=E:\app\JSP\apache-tomcat-8.5.82\webapps"

REM Création du répertoire temp
mkdir temp

REM Copie du projet dans le répertoire temp
xcopy "%project%" temp /E /C /I /Q /H /R /K /Y


REM Changement du répertoire courant vers temp
cd temp
echo cd

REM Copie du fichier FW.jar dans le répertoire lib du projet
copy "%fw%" "WEB-INF\lib"

REM Compilation des fichiers de src vers le dossier classes avec l'option parameters
javac   -d WEB-INF\classes src\*.java

REM Exportation du projet en un fichier .war
rd /s /q src
jar -cvf "%name%".war *

REM Copie du fichier .war dans le répertoire webapps de Tomcat
copy "%name%".war "%deploy%"

REM Suppression du répertoire temp
cd ../
rd /s /q temp

echo Deploiement effectue.


