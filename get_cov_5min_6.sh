NO_INTERVAL=6
TIME_INTERVAL=5
OUTPUT_DIR=${2:-.}  # Use the second command line argument as the output directory, default to current directory

# Create the output directory if it doesn't exist
mkdir -p "$OUTPUT_DIR"

SET=$(seq 1 "$NO_INTERVAL")
for i in $SET
do
    sleep "$TIME_INTERVAL"m
    java -jar org.jacoco.cli-0.8.7-nodeps.jar dump --address localhost --port "$1" --destfile "$OUTPUT_DIR/jacoco_$1_$i.exec"
done
