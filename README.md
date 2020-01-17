# Airbnb App
Web application for a system that supports apartment reservation. The application is used by three user groups: Guest, Host and Administrator. 

## Functionalities
### Registration
User can register in application and become guest. Administrators are programmatically added and cannot be added subsequently. Hosts can only be created by an administrator. An unregistered user logs on to the system by entering the username and password of the user for which he is registered. Thereafter, the user is logged in and can perform the activities provided by his role. All logged in users can see their profiles and change their personal information. Administrators have an overview of all users registered on the system. The host has an overview of all their apartments, apartments reservations and guests who have booked certain apartments.

### Apartments
Unregistered users only have an overview of all ACTIVE apartments. They can search and sort apartments by all criteria. They can see comments from users for apartments. Guests have the overview, search and sorting of ACTIVE apartments by all criteria. They can see comments from users for apartments. The hosts have an overview, search and sorting of their ACTIVE apartments by all criteria. In addition, the hosts can see their INACTIVE apartments. Administrators can view all apartments regardless of their status. Hosts can create, modify and delete their apartments. Initial status of the apartment is INACTIVE. Administrators can modify and delete any existing apartments. 

### Amenities
The administrator can define (create, modify, delete) a list of all contents that can be found in apartments. When creating or changing an apartment, the hosts have a list of all available apartment amenities that they can add to that apartment. 

### Reservations
Guests have an overview of their reservations. The hosts have an overview of bookings of all their apartments in any status. Administrators have an overview of all bookings. Only guests can create reservations. Selecting an apartment, guest can see the availability by dates for seleceted apartment. The guest then selects the start check in date and enters the number of nights, and the system checks if that apartment is available for the specified days. If everything is OK, a reservation is created with the status CREATED, and if the check has not passed, a message is printed that the reservation cannot be made for the specified dates. Guest can cancel the reservation as long as it is in CREATED or ACCEPTED status. The guest has the option to cancel the reservation and the status changes to CANCELLATION. The host can either accept a reservation that is in the CREATED status (whereby the reservation changes status to ACCEPTED) or refuse it if it is in the CREATED or ACCEPTED status (whereby the reservation changes status to DISCLAIMED). The host sets the reservation for FINAL only after the end of the night. 

### Comments
Comments on apartments can be left by guests whose reservations for that apartment are in REJECTED or COMPLETED status. The apartment host chooses which comments will be displayed on their apartments. Guests can see comments on apartments only approved by the host. Hosts and Administrators can see all comments.