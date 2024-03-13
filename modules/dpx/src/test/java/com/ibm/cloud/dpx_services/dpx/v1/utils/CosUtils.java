// package com.ibm.cloud.dpx_services.dpx.v1.utils;

// import java.io.File;
// import java.io.IOException;
// import java.io.BufferedReader;
// import java.io.InputStreamReader;

// public class CosUtils {

//   public static void uploadTermsDoc(String cosUrl) {
//     // String API_KEY = System.getenv("IAM_API_KEY");
//     // String APIKEY = System.getenv("IAM_API_KEY");
//     // String iamToken = AuthHelper.generateIAMToken(API_KEY);
//     // String COS_URL = System.getenv("COS_URL");
//     // String cosUrl= " https://s3.us-west.cloud-object-storage.test.appdomain.cloud/defaultdataproductca-datacatalog-59pp2oisvcmrflxiun0xd/b6eb50b4-ace4-4dab-b2c4-318bb4c032a6/1b64f29a-be4a-419c-9973-6380055e1fba/c8410be5-4eac-473d-a50c-276df0eaff0e?uploadId=0100018d-9bb9-ec69-f889-0f65716c332a&partNumber=1&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20240212T051109Z&X-Amz-SignedHeaders=host&X-Amz-Expires=86400&X-Amz-Credential=06e5fa56967945658e12ac62c9987d78%2F20240212%2Fus-standard%2Fs3%2Faws4_request&X-Amz-Signature=67793178f516621b37688e6ae0b7172211f6b05b682adf4d0ea60577eadb30d3 ";
//     String termsFilePath = System.getProperty("user.dir") + File.separator + "demo.csv";
//     System.out.println("upload_url received:" + cosUrl);
//     String curlCommand = "curl --request PUT " +
//       "--url \"" + cosUrl + "\" " +
//       "--header 'content-type: csv' " +
//       "--header 'user-agent: vscode-restclient' " +
//       "--data @" + "'" + termsFilePath + "'";
    
//     // String token = "eyJraWQiOiIyMDI0MDIyMzE0MzQiLCJhbGciOiJSUzI1NiJ9.eyJpYW1faWQiOiJJQk1pZC02NjUwMDNHQU1KIiwiaWQiOiJJQk1pZC02NjUwMDNHQU1KIiwicmVhbG1pZCI6IklCTWlkIiwianRpIjoiNDRjOTQ1ZWUtNzM0MS00ODgwLWE3ZGMtN2M1NmRkNGUyZDFkIiwiaWRlbnRpZmllciI6IjY2NTAwM0dBTUoiLCJnaXZlbl9uYW1lIjoiQWFydXNoIiwiZmFtaWx5X25hbWUiOiJTaW5naCIsIm5hbWUiOiJBYXJ1c2ggU2luZ2giLCJlbWFpbCI6IkFhcnVzaC5TaW5naEBpYm0uY29tIiwic3ViIjoiQWFydXNoLlNpbmdoQGlibS5jb20iLCJhdXRobiI6eyJzdWIiOiJBYXJ1c2guU2luZ2hAaWJtLmNvbSIsImlhbV9pZCI6IklCTWlkLTY2NTAwM0dBTUoiLCJuYW1lIjoiQWFydXNoIFNpbmdoIiwiZ2l2ZW5fbmFtZSI6IkFhcnVzaCIsImZhbWlseV9uYW1lIjoiU2luZ2giLCJlbWFpbCI6IkFhcnVzaC5TaW5naEBpYm0uY29tIn0sImFjY291bnQiOnsidmFsaWQiOnRydWUsImJzcyI6IjMyY2U3MWQ0MDA2OTRlYmNhZDhjODg3OGM2NzBhNDBjIiwiZnJvemVuIjp0cnVlfSwiaWF0IjoxNzA4OTIzMDgyLCJleHAiOjE3MDg5MjY2ODIsImlzcyI6Imh0dHBzOi8vaWFtLnRlc3QuY2xvdWQuaWJtLmNvbS9vaWRjL3Rva2VuIiwiZ3JhbnRfdHlwZSI6InVybjppYm06cGFyYW1zOm9hdXRoOmdyYW50LXR5cGU6YXBpa2V5Iiwic2NvcGUiOiJpYm0gb3BlbmlkIiwiY2xpZW50X2lkIjoiYngiLCJhY3IiOjEsImFtciI6WyJwd2QiXX0.yubf8smUVZWaY9_-sv7Xl1-FntJ5HkVJYtoQvrXl0gRVQobm4q1r6aaJARUJQdqQwzUIw1B3E54pz_i_o2eL4WVSIOdBlfoQ390pAqFW_WJh_nkdIZ0WJgV7sSGQl_yj3LX6xez1Wr4kw7yd9BUsAS_e88xDBpAF4eJOBI9IB2a1D1M2u8GM6p1BGYvmiWvv-SCnVp9LD77Bd8Zv2Tdo8kOhJrQdjLo4-iKDeWB5yQGnb0VV3YtfoO4V1PTrmU4RvTC42_wb0ZBznzrFWJSYDIrWLj0V-NGunvhkcSwJQ6efFXcqM3d5PVp0xVR96So-cXqKysM8BztLu3jRrJOwsg";
//     String curl_command = "curl -X PUT -H \"Authorization: Bearer " + token + "\" -T " + termsFilePath + " " + cosUrl;
//     System.out.println("Curl formed" + curl_command);
    
//     try {
//       Process process = Runtime.getRuntime().exec(curl_command);
//       BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
//       String line;
//       while ((line = errorReader.readLine()) != null) {
//         System.err.println("Error output from curl command: " + line);
//       }
//       errorReader.close();
//       int responseCode = process.waitFor();
//       if (responseCode == 0) {
//         System.out.println("Document uploaded successfully.");
//       } else {
//         System.err.println("Failed to upload document.:" + responseCode);
//       }
//     } catch (IOException e) {
//       System.err.println("IOException occurred: " + e.getMessage());
//       e.printStackTrace();
//     } catch (InterruptedException e) {
//       System.err.println("InterruptedException occurred: " + e.getMessage());
//       e.printStackTrace();
//     }
//   }
// }


// // List<String> commands = new ArrayList<>();
// //             commands.add("curl");
// //             commands.addAll(List.of(curlCommand.split("\\s+")));

// //             ProcessBuilder processBuilder = new ProcessBuilder(commands);
// //             Process process = processBuilder.start();

// //             BufferedReader reader =
// //                     new BufferedReader(new InputStreamReader(process.getInputStream()));