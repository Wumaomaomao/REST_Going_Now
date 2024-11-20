#!/bin/bash

# activate python environment
source /home/wyc/REST_GO/venv/bin/activate

#define test variables (***)
Restler=/home/wyc/REST_GO/restler_bin/restler/Restler
swagger_file=/home/wyc/REST_GO/specifications/features_openapi.yaml

# Compile
echo "Starting RESTler compilation..."
./$Restler --api_spec $swagger_file

# # Test mode
# echo "Starting RESTler test mode..."
# python ./Restler/restler/restler.py --grammar_file ./Compile/grammar.py --dictionary_file ./Compile/dict.json --settings ./Compile/engine_settings.json --no_ssl --test_all

# # Fuzz mode 
# echo "Starting RESTler fuzzing..."
# python ./Restler/restler/restler.py --grammar_file ./Compile/grammar.py --dictionary_file ./Compile/dict.json --settings ./Compile/engine_settings.json --no_ssl --time_budget 1 --fuzzing_mode bfs-fast
