##1. list of CRC Cards

1) ClassName: **Customer**
    
   Responsibility: 
   				   a) Know name, cell phone and number of peope in the party

   				   b) Send response whether confirm or leave when table is ready

   Collaborator: WaitlistManagementSystem


2) ClassName:  **WaitlistManagementSystem**

   Responsibility: 
   				   a) Know customer waitlistmanagementsystem queue and the table needs for the peek of the queue

   				   b) Add new customer to waitlistmanagementsystem queue

   				   c) Remove customer from waitlistmanagementsystem queue

   				   d) Send message to customer when successfully registered

   				   e) Get notification from tablemanagementsystem when table is ready

   				   f) Send message to customer when table is ready

   				   g) Get response from customer about confirm table or leave

   				   h) Inform Tablemanagementsystem to reserve table when customer confirm table

   Collaborator:  Customer, TableManagementSystem


3) ClassName:  **TableManagementSystem**
