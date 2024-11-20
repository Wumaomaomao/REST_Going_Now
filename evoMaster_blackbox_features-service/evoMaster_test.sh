#!/bin/bash

evomaster_pkg=~/REST_Go/evomaster.jar
features_swagger_url=file:///home/wyc/REST_Go/specifications/features_openapi.yaml
# Run EvoMaster in black-box mode for features-service
java -jar $evomaster_pkg \
    --blackBox true \
    --bbSwaggerUrl $features_swagger_url \
    --bbTargetUrl http://localhost:50100 \
    --outputFormat JAVA_JUNIT_4 \
    --maxTime 300s \
    --ratePerMinute 60 
