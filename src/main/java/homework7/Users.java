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
        StringBuilder usersList = new StringBuilder();


        int i = 0;
        int q = 0;

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

                usersList.append("Id: ").append(id).append("\n").append("Name: ").append(name).append("\n").append("Username: ").append(username).append("\n");
                usersList.append("Email: ").append(email).append("\n").append("Phone: ").append(phone).append("\n").append("Website: ").append(website).append("\n");
                usersList.append("\n");
            }

            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(usersFile))) {
                bufferedWriter.write(String.valueOf(usersList));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeUsersEmailOnly() {
        File usersFile = new File("UsersEmails.txt");
        StringBuilder emailsList = new StringBuilder();

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
                emailsList.append(email).append("\n");
            }
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(usersFile))) {
                bufferedWriter.write("Emails\n");
                bufferedWriter.write(String.valueOf(emailsList));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

