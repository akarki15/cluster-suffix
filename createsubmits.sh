counter=1
upLimit=5
book1="b1"
book2="b2"
while [ $counter  -le $upLimit ]; do
		echo "UNIVERSE = vanilla
EXECUTABLE = /home/akarki15/suffix/run.jar
ERROR = /home/akarki15/suffix/error/$counter.txt
OUTPUT = /home/akarki15/suffix/output/$book1"_"$book2"_"$counter.txt
NOTIFICATION = never
QUEUE" > submit-files/$book1"_"$book2"_"$counter.submit-file
		condor_submit submit-files/$book1"_"$book2"_"$counter.submit-file
	let counter=counter+1
done
