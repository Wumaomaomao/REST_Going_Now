#!/bin/bash
source ~/.bashrc

# activate python environment
source ~/REST_Go/venv/bin/activate

#define test variables (***)
Restler=~/REST_Go/restler/restler_bin/restler/Restler
swagger_file=~/REST_Go/specifications/features_openapi.yaml

# Compile
echo "Starting RESTler compilation..."
$Restler compile --api_spec $swagger_file

# Test mode
echo "Starting RESTler test mode..."
$Restler test --grammar_file ./Compile/grammar.py --dictionary_file ./Compile/dict.json --settings ./Compile/engine_settings.json --no_ssl

# Fuzz mode 
echo "Starting RESTler fuzzing..."
$Restler fuzz --grammar_file ./Compile/grammar.py --dictionary_file ./Compile/dict.json --settings ./Compile/engine_settings.json --no_ssl --time_budget 0.5

