counter=1
upLimit=5
book1="b1"
book2="b2"
while [ $counter  -le $upLimit ]; do
		echo "UNIVERSE = vanilla
EXECUTABLE = /home/akarki15/suffix/run.jar
ERROR = /home/akarki15/suffix/error/$counter.txt
OUTPUT = /home/akarki15/scp/output/$book1"_"$book2"_"$counter.txt
ARGUMENTS = /home/akarki15/suffix/input/$book1.txt /home/akarki15/suffix/input/$book2.txt 12
INITIALDR = /home/akarki15/suffix/output/
NOTIFICATION = never
QUEUE" > submit-files/$book1"_"$book2"_"$counter.submit-file
		condor_submit submit-files/$book1"_"$book2"_"$counter.submit-file
	let counter=counter+1
done
