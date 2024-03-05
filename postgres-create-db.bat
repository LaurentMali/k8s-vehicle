@echo off
setlocal enabledelayedexpansion

SET DIR=.\db-postgres

IF EXIST "%DIR%" (
    echo %DIR% already exists, the installation has exited ...
    exit /b 1
)

echo Installing postgres into %DIR% ...
mkdir %DIR%
cd %DIR%
copy ..\src\main\docker\docker-compose-postgres.yml .\docker-compose-postgres.yml

:end
endlocal
