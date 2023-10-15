*Soal Prioritas 1* 
Apakah proses testing secara manual perlu dilakukan meskipun tools yang memanfaatkan artificial intelligence sudah dikembangkan? Jelaskan alasannya!

Ya, proses pengujian perangkat lunak secara manual masih diperlukan meskipun alat yang menggunakan kecerdasan buatan (artificial intelligence) telah dikembangkan. Ada beberapa alasan mengapa pengujian manual masih penting:

1. **Kecerdasan Terbatas AI**: Meskipun AI memiliki kemampuan untuk otomatisasi sejumlah tugas pengujian, ia memiliki batasan dalam pemahaman konteks dan kasus pengujian yang kompleks. AI cenderung kurang efektif dalam mengidentifikasi masalah yang sangat spesifik, kasus uji yang belum pernah ditemui sebelumnya, atau dalam menguji aspek yang melibatkan interaksi manusia.

2. **Kemampuan Logika dan Intuisi Manusia**: Manusia memiliki kemampuan logika, intuisi, dan pemahaman konteks yang sulit ditiru oleh AI. Terkadang, masalah dalam perangkat lunak bisa sangat halus dan memerlukan pengetahuan manusia untuk mengenali potensi masalah dan dampaknya pada pengguna.

3. **Uji Pengalaman Pengguna (User Experience Testing)**: Pengujian pengalaman pengguna, seperti antarmuka pengguna (UI/UX), interaksi pengguna, dan alur kerja, seringkali memerlukan intervensi manusia. Ini mencakup aspek seperti estetika, keterbacaan, kejelasan, dan rasa dari pengalaman pengguna yang sulit diukur secara otomatis.

4. **Pengujian Uji Keamanan (Security Testing)**: Pengujian keamanan seringkali memerlukan pemahaman mendalam tentang ancaman keamanan dan metode serangan yang sulit diotomatisasi sepenuhnya.

5. **Uji Pengujian Ulang (Regression Testing)**: Pengujian ulang yang memastikan bahwa perubahan yang diterapkan pada perangkat lunak tidak mempengaruhi fungsi yang ada atau mengenalkan masalah baru masih memerlukan intervensi manusia untuk mengkonfigurasi dan memantau.

6. **Validasi dan Verifikasi Manual**: Beberapa perangkat lunak yang kompleks mungkin memerlukan validasi manual terhadap dokumen persyaratan dan peraturan yang diterapkan.

7. **Pengujian Penyelidikan**: Terkadang, pengujian manual diperlukan untuk mengidentifikasi penyebab masalah yang tidak dapat dijelaskan oleh hasil otomatisasi. Manusia dapat melakukan penyelidikan lebih mendalam.

8. **Keterlibatan Pengguna Akhir**: Beberapa aspek pengujian, seperti pengujian beta atau penilaian pengguna akhir, memerlukan keterlibatan manusia dalam berbagai situasi penggunaan yang sesungguhnya.

Meskipun alat AI dapat membantu otomatisasi beberapa jenis pengujian dan membantu dalam proses pengujian, pengujian perangkat lunak secara manual masih penting untuk memastikan kualitas dan keandalan perangkat lunak dalam berbagai konteks dan situasi yang mungkin sulit diotomatisasi sepenuhnya. Dalam sebagian besar kasus, kombinasi antara pengujian manual dan otomatisasi adalah pendekatan yang paling efektif.


*Soal Prioritas #2*

**Fitur Sign UP**

**AI Test Case and Scenario (ChatGPT)**

**Positive Scenarios:**

1. **Successful Sign-Up**:
   - Input a valid username and password.
   - Click the "Sign Up" button.
   - Verify that you are redirected to a confirmation or welcome page.
   - Check for a confirmation message.

2. **Case-Insensitive Username**:
   - Input a valid username in both lowercase and uppercase characters.
   - Input a valid password.
   - Click the "Sign Up" button.
   - Verify that the system accepts the username in a case-insensitive manner.
   - Check for a confirmation message.

3. **Long Username and Password**:
   - Input a long valid username (e.g., 50 characters).
   - Input a long valid password (e.g., 20 characters).
   - Click the "Sign Up" button.
   - Verify that the system accepts long usernames and passwords.
   - Check for a confirmation message.

**Negative Scenarios:**

4. **Empty Username and Password**:
   - Leave both the username and password fields empty.
   - Click the "Sign Up" button.
   - Verify that the system displays an error message, indicating that both fields are required.

5. **Empty Username**:
   - Leave the username field empty.
   - Input a valid password.
   - Click the "Sign Up" button.
   - Verify that the system displays an error message, indicating that the username field is required.

6. **Empty Password**:
   - Input a valid username.
   - Leave the password field empty.
   - Click the "Sign Up" button.
   - Verify that the system displays an error message, indicating that the password field is required.

7. **Invalid Username and Password**:
   - Input an invalid or restricted username (e.g., one that contains special characters).
   - Input an invalid or weak password (e.g., "12345").
   - Click the "Sign Up" button.
   - Verify that the system displays an error message indicating the specific issues with the username and password fields.

8. **Username Already Exists**:
   - Input a username that already exists in the system.
   - Input a valid password.
   - Click the "Sign Up" button.
   - Verify that the system displays an error message indicating that the username is already taken.

9. **Password Strength**:
   - Input a valid username.
   - Input a weak password (e.g., "password" or "123456").
   - Click the "Sign Up" button.
   - Verify that the system displays an error message indicating that the password is too weak. 

10. **Username/Password Length Limit**:
    - Input an extremely long username (e.g., 100 characters).
    - Input a very long password (e.g., 50 characters).
    - Click the "Sign Up" button.
    - Verify that the system enforces a reasonable length limit and displays an error message.



**Manual Test Case and Scenario**

**Positive Scenario :** 

1. **User Sign Up Using Valid Credential (“username” and “password”)**
    As a user i can sign up my account 
    So That i can access application feature   

    Scenario : User fill form with valid credentials to sign up account
    Given i can access sign up page 
    When i fill "username" form using valid username
    And i fill "password" form using my password
    And i click "sign up" button 
    Then i have account 


**Negative Scenario**

2. **User Sign Up Using Invalid Username**
    Scenario : User fill form with invalid character on "username" form
    Given i can access sign up page 
    When i fill "username" form using invalid character (!,@,#,$,%)
    And i click "sign up" button 
    Then i receive error message 

3. **User Sign Up Without Filling “Username” and “Password” Form**
    Scenario : User doesn't fill form 
    Given i can access sign up page 
    When i click "sign up" button without "username" and "password" form 
    Then i receive error message 




**Purchase Item Feature**

**AI Test Case (ChatGPT)**

**Scenario 1: Positive Buy and Checkout**

Feature: Buy Items Feature

  Scenario: User successfully buys items and checks out
    Given the user is on the www.demoblaze.com homepage
    When the user clicks on a product to view its details
    And the user clicks the "Buy" button
    And the item is added to the cart
    And the user goes to the cart
    And the user clicks "Checkout"
    And the user fills out the confirmation form with valid details:
      | Name             | City         | Country | Credit Card Number | Month | Year |
      | John Doe         | New York     | USA     | 1234 5678 9012 3456 | 12    | 2024 |
    And the user clicks "Purchase"
    Then the user should receive a confirmation message
    And the user should be redirected to the thank you page

**Scenario 2: Missing Credit Card Information**

Feature: Buy Items Feature

  Scenario: User tries to checkout without providing credit card information
    Given the user is on the www.demoblaze.com homepage
    When the user clicks on a product to view its details
    And the user clicks the "Buy" button
    And the item is added to the cart
    And the user goes to the cart
    And the user clicks "Checkout"
    And the user fills out the confirmation form with valid details except for the credit card information:
      | Name             | City         | Country | Credit Card Number | Month | Year |
      | John Doe         | New York     | USA     |                   | 12    | 2024 |
    And the user clicks "Purchase"
    Then the user should see an error message indicating missing credit card information
    And the user should remain on the confirmation form page

**Scenario 3: Invalid Credit Card Number**

Feature: Buy Items Feature

  Scenario: User tries to checkout with an invalid credit card number
    Given the user is on the www.demoblaze.com homepage
    When the user clicks on a product to view its details
    And the user clicks the "Buy" button
    And the item is added to the cart
    And the user goes to the cart
    And the user clicks "Checkout"
    And the user fills out the confirmation form with invalid credit card information:
      | Name             | City         | Country | Credit Card Number | Month | Year |
      | John Doe         | New York     | USA     | 123456789012345   | 12    | 2024 |
    And the user clicks "Purchase"
    Then the user should see an error message indicating an invalid credit card number
    And the user should remain on the confirmation form page


**Manual Test Case**

**Scenario 1: Positive Buy and Checkout**
Feature: Purchase Items 

  Scenario: User successfully buys items and checks out
    Given the user is on the www.demoblaze.com homepage
    When the user clicks on a product to view its details
    And the user clicks the "Add to Cart" button
    And the item is added to the cart
    And the user goes to the cart (not redirected automatically)
    And the user clicks "Place order"
    And the user fills out the confirmation form with valid details:
      | Name             | City         | Country | Credit Card Number | Month | Year |
      | John Doe         | New York     | USA     | 1234 5678 9012 3456| 12    | 2024 |
    And the user clicks "Purchase"
    Then the user should receive a confirmation message

**Scenario 2: Missing Credit Card Information**
  Scenario: User tries to checkout without providing credit card information
    Given the user is on the www.demoblaze.com homepage
    When the user clicks on a product to view its details
    And the user clicks the "Add to Cart" button
    And the item is added to the cart
    And the user goes to the cart (not redirected automatically)
    And the user clicks "Place Order"
    And the user fills out the confirmation form with valid details except for the credit card information:
      | Name             | City         | Country | Credit Card Number | Month | Year |
      | John Doe         | New York     | USA     |                    |       |      |
    And the user clicks "Purchase"
    Then the user should see an error message indicating missing credit card information
    And the user should redirected back to the confirmation form page

**Scenario 3: Invalid Credit Card Number**
  Scenario: User tries to checkout with an invalid credit card information
    Given the user is on the www.demoblaze.com homepage
    When the user clicks on a product to view its details
    And the user clicks the "Add to Cart" button
    And the item is added to the cart
    And the user goes to the cart
    And the user clicks "Place Order"
    And the user fills out the confirmation form with invalid credit card information:
      | Name             | City         | Country | Credit Card Number | Month | Year |
      | John Doe         | New York     | USA     | XXX123YYYYYAAAAA   | 14    | 1892 |
    And the user clicks "Purchase"
    Then the user should see an error message indicating an invalid credit card information
    And the user should redirected back to the confirmation form page


**Scenario 3: Invalid User Information**
  Scenario: User tries to checkout with an invalid credit card information
    Given the user is on the www.demoblaze.com homepage
    When the user clicks on a product to view its details
    And the user clicks the "Add to Cart" button
    And the item is added to the cart
    And the user goes to the cart
    And the user clicks "Place Order"
    And the user fills out the confirmation form with invalid user information:
      | Name             | City         | Country | Credit Card Number | Month | Year |
      | #####121         | JKT48202     | IDK     |1234 5678 9012 3456 | 12    | 2024 |
    And the user clicks "Purchase"
    Then the user should see an error message indicating an invalid user information
    And the user should redirected back to the confirmation form page



Perbedaan Pembuatan Test Case dan Scenario oleh AI dan Manual 

AI                                         
- AI lebih konsisten dalam pembuatan scenario       
- AI kurang tepat dalam menganalisis kebutuhan pengguna untuk menyusun test case
- AI lebih banyak berfokus pada data yang berkaitan dengan alat (credit card number, password)
- AI kurang bisa bereksplorasi dalam pembuatan test case 
- AI cenderung kurang efektif dalam menghasilkan test case yang melibatkan interaksi kompleks atau pemahaman konteks yang mendalam
- AI dapat menghasilkan sejumlah besar test case dalam waktu yang relatif singkat.

Manual 
- Pembuatan scenario secara manual kurang konsisten
- Test Case dan Scenario yang dibuat manual dapat lebih memahami kebutuhan pengguna 
- Pembuatan manual dapat bereksplorasi terkait dengan data yang digunakan dalam test case baik itu subyektif maupun obyektif 
- Pembuatan Test Case secara manual dapat menciptakan test case baru yang mungkin belum pernah dilakukan sebelumnuya 
- Pengerjaan manual dapat menghasilkan test case yang memerlukan pemahaman dan interpretasi yang rumit.
- Pembuatan test case manual memerlukan waktu lebih lama terutama untuk kasus-kasus yang melibatkan iterasi.
