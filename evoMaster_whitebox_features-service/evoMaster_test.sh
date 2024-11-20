#!/bin/bash

evomaster_pkg=~/REST_Go/evomaster.jar
# Run EvoMaster in white-box mode for features-service
java -jar $evomaster_pkg \
    --sutControllerPort 40101 \
    --sutControllerHost localhost \
    --maxTime 1800s
    
    # outputFormat=JAVA_JUNIT_4 \
    # maxTime=300s \
    # ratePerMinute=60 