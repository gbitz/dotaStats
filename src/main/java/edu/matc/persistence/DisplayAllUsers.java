package edu.matc.persistence;

import edu.matc.entity.Role;
import edu.matc.entity.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.List;


@Path("/users")
public class DisplayAllUsers {
    @GET
    @Produces("text/JSON")
//    @Path("/{searchTerm}")
    public Response getUsersAndRoles() {
        GenericDao userDao = new GenericDao(User.class);
        GenericDao roleDao = new GenericDao(Role.class);
        List<User> allUsers;
        List<Role> allRoles;

        allUsers = userDao.getAll();
        allRoles = roleDao.getAll();

        String output = "{\"User\" : ";
        for (User user : allUsers) {
            output += "{\"firstName\":\"" + user.getFirstName() + ",\" \"lastName\":\"" + user.getLastName() + ",\" \"userName\":\"" + user.getUserName() + ",\" \"steamID\":\"" + user.getSteamID() + "}";

        }
        output += "}";

        String roleOutput = "{\"Role\" : ";
        for (Role role : allRoles) {
            roleOutput += "{\"userName\":\"" + role.getUser().getUserName() + ",\" \"role\":\"" + role.getRole() + ",\" \"id\":\"" + role.getId() + "}";

        }
        roleOutput += "}";
        return Response.status(200).entity(output + "\n" +roleOutput).build();

    }

}
