delete from users;
delete from roles;
delete from matches;
INSERT INTO users VALUES (1,'Grant','Bitzer','gbitzer','password','4765894'),(2,'Fred','Hensen','fhensen','supersecret2','26561197965031622'),(3,'Barney','Curry','bcurry','supersecret3','36561197965031622'),(4,'Karen','Mack','kmack','supersecret4','46561197965031622'),(5,'Dianne','Klein','dklein','supersecret5','56561197965031622'),(6,'Dawn','Tillman','dtillman','supersecret6','66561197965031622');
INSERT INTO roles VALUES (1,'admin',1,'gbitzer'),(2,'user',1,'gbitzer'),(3,'user',2,'fhensen'),(4,'user',3,'bcurry'),(5,'user',4,'kmack'),(6,'user',5,'dklein'),(7,'user',6,'dtillman');
INSERT INTO `matches` VALUES (5,'4730832010',1,'gbitzer'),(6,'4721621778',1,'gbitzer');


