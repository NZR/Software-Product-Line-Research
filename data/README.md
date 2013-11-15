Here you will find the data that we extracted during our study of the 
Linux kernel feature model evolution. 

You will find all changes that we have here. 

The file "MySQL_Schema" contains the description of the tables that we used. 
For now, the table called "coarse_grain_changes" is not used.

The data is contained in "fmdiffdata.sql" and can be imported into a MySQL database. 
For this work, I used the following installation: 

+-------------------------+------------------------------+
| Variable_name           | Value                        |
+-------------------------+------------------------------+
| innodb_version          | 5.6.12                       |
| protocol_version        | 10                           |
| slave_type_conversions  |                              |
| version                 | 5.6.12                       |
| version_comment         | MySQL Community Server (GPL) |
| version_compile_machine | x86_64                       |
| version_compile_os      | osx10.7                      |
+-------------------------+------------------------------+

Also in this folder, you can find an Excel Spreadsheet detailing the comparison 
we did during the evaluation of FMDiff data. 
The first sheet describes the 100 changes we extracted from FMDiff and matched with Kconfig file changes, 
and the second one contains the 25 Kconfig file changes that we matched with FMDiff data. 

