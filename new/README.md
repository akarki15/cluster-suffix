RUNNING CODE ON THE CLUSTER

RunWord.jar, submitFile, and your input books should all be in the same folder.
If you want to run RunWord on a local machine, the usage is java -jar RunWord.jar <number of first book> <chapter number> <number of second book>, and it creates a file containing the longest common phrase between chapter <chapter number> of <first book> and the entire <second book>. (ex. java -jar RunWord.jar 1 29 4 will compare chapter 29 of book1.txt to the entire book4.txt.)
You need the books to be in the format "book#.txt" where '#' is an arbitrary number identifying the book.
You'll need to create folders called "output" and "runWordLog" in the directory (if you take the error/output/log lines out of submitFile, you won't need them, though).
To compare two books, you'll need to modify submitFile. Change the paths to point to your current folder. The current file compares books 1 and 4: change 1 and 4 to the numbers of the books you want to compare. Also, on the last line, change "queue 237" to however many chapters are in the first book.
To run the entire comparison, you only need to condor_submit submitFile. Errors and the standard output (println statements) will be in output.
The actual output files will be placed directly in the current folder! I tried moving them to a separate folder but didn't have much luck. Once the jobs have completed, you can move them without any problem.
To complete the comparison, place OutputReader.java in the same folder as your output files and run java OutputReader <number of book 1> <number of book 2>. It will print out how many output files it found, and the longest LCS. (ex. java OutputReader 1 4 will crawl through the files from comparing book1.txt and book4.txt, and print out some string.)