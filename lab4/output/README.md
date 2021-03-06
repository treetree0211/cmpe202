**1. list of CRC Cards**


| **ClassName** | **Responsibility**    | **Collaborator**  |
| ------------- |:-------------| ----- |
| Customer     |1. Know name, cell phone and number of peope in the party | WaitlistManagementSystem |
|               |2. Send response whether confirm or leave when table is ready    |    |




| **ClassName** | **Responsibility**    | **Collaborator**  |
| ------------- |:-------------| ----- |
| WaitlistManagementSystem |1. Know customer waitlistmanagementsystem queue <br> and the table needs for the peek of the queue | Customer |
|               |2. Add new customer to waitlistmanagementsystem queue    | TableManagementSystem|
|               |3. Remove customer from waitlistmanagementsystem queue    | |
|               |4. Send message to customer when successfully registered    | |
|               |5. Get notification from tablemanagementsystem when table is ready    | |
|               |6. Send message to customer when table is ready    | |
|               |7. Get response from customer about confirm table or leave    | |
|               |8. Inform Tablemanagementsystem to reserve table when customer confirm table    | |




| **ClassName** | **Responsibility**    | **Collaborator**  |
| ------------- |:-------------| ----- |
| TableManagementSystem  |1. Get status from table | WaitlistManagementSystem |
|               |2. Update status to waitlistmanagementsystem when table is ready  | Table   |
|               |3. Get response from waitlistmanagementsystem about reserving a table    |    |






| **ClassName** | **Responsibility**    | **Collaborator**  |
| ------------- |:-------------| ----- |
| Table         |1. Provide seats number | TableManagementSystem |
|               |2. Provide table status |    |



**2. State Pattern && Observer Design Pattern**

I used both state pattern and observer design pattern. 

##For the **state Pattern**, the table has state "ready" and state "not available". When the state is "ready", the tablemangementsystem can inform waitlistmanagementsystem to reserve a table or not. When tablemanagementsystem gets response about reserving a table, the state becomes "not available".

##For the **observer Pattern**, the observer is waitlistManagementSystem. Whenever the tablemanagement receives table updated status, it will notify waitlistManagementSystem observer, and the observer will send message to customers for futher interactions. Since there will be many customers and only one waitlistManagementSystem, we can apply one-to-many relationships observer pattern in this case.
