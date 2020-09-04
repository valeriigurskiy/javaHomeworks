package homework7;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Users {
    public void writeAllUsers() {
        File usersFile = new File("Users.txt");
        List<String> usersList = new ArrayList<String>();


        int i = 0;

        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/users");
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();
            StringBuilder jsonData = new StringBuilder();
            while ((i = inputStream.read()) != -1) {
                jsonData.append((char) i);
            }

            JSONArray usersArray = new JSONArray(jsonData.toString());
            for (int j = 0; j < usersArray.length(); j++) {
                JSONObject object = usersArray.getJSONObject(j);
                int id = object.getInt("id");
                String name = object.getString("name");
                String username = object.getString("username");
                String email = object.getString("email");
                String phone = object.getString("phone");
                String website = object.getString("website");

                usersList.add("Id: " + id + "\n" + "Name: " + name + "\n"
                        + "Username: " + username + "\n" + "Email: " + email + "\n"
                        + "Phone: " + phone + "\n" + "Website: " + website + "\n");
            }
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(usersFile))) {
                for (String user : usersList) {
                    bufferedWriter.write(user + "\n");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public void writeUsersEmailOnly() {
        File usersFile = new File("UsersEmails.txt");
        List<String> emailsList = new ArrayList<String>();

        int i = 0;

        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/users");
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();
            StringBuilder jsonData = new StringBuilder();
            while ((i = inputStream.read()) != -1) {
                jsonData.append((char) i);
            }

            JSONArray emailsArray = new JSONArray(jsonData.toString());
            for (int j = 0; j < emailsArray.length(); j++) {
                JSONObject object = emailsArray.getJSONObject(j);
                String email = object.getString("email");
                emailsList.add(email);
            }
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(usersFile))) {
                bufferedWriter.write("Emails\n");
                for (String email : emailsList) {
                    bufferedWriter.write(email + "\n");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

