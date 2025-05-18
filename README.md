#  Test Automation Project - DemoBlaze

Bu proje, [DemoBlaze](https://www.demoblaze.com/) web uygulamasının temel kullanıcı senaryolarını **Selenium**, **TestNG** ve **Allure** raporlama araçları kullanarak otomatize eder.

## 🔧 Teknolojiler ve Araçlar

-  **TestNG** – Test Framework
-  **Selenium WebDriver** – UI test otomasyonu
-  **Maven** – Bağımlılık yönetimi
-  **Allure** – Test raporlama aracı
-  **Jenkins** – CI/CD entegrasyonu
-  **Java** – Programlama dili

## 🧪 Test Senaryoları
### Manuel Test Senaryoları
10 adet manuel test senaryosu oluşturulmuştur.
### Otomasyon Test Senaryoları 
####  Login Testleri (`LoginTests.java`)
- Geçerli kullanıcı ile başarılı giriş
- Geçersiz kullanıcı adı ile giriş denemesi
- Yanlış şifre ile giriş denemesi

####  Register Testleri (`SignInTests.java`)
- Yeni kullanıcı kaydı başarılı
- Daha önce kayıtlı kullanıcı adıyla tekrar kayıt olunamaz

##  Allure Raporları

Test çalıştırmalarının ardından **Allure** ile otomatik olarak rapor oluşturulmuştur.

### Genel Görünüm (Overview)
![Ekran Alıntısı](https://github.com/user-attachments/assets/efc8a53b-edf0-44e9-bbc2-fe9767c1eeb5)

### Test Detayları (Login & SignUp)

![Ekran Alıntısı1](https://github.com/user-attachments/assets/8ae4f8e7-e96f-4df2-bef4-030ff8c14b1c)

![Ekran Alıntısı2](https://github.com/user-attachments/assets/2cf70da1-c4f9-4d7e-b50d-70f904533784)


##  Proje Nasıl Çalıştırılır?

1. **Projeyi klonla:**
   ```bash
   git clone https://github.com/sntekinay/Test-Automation-DemoBlaze.git
   cd Test-Automation-DemoBlaze
   cmd >> allure serve
