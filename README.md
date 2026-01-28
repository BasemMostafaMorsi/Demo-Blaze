# 🧪Demo Blaze

#Description

* automation exercise test * is a test automation project using Selenium and Rest Assured for wep application and Api testing . the project is designed to be modular and custmaizable , allowing easy adaptaiton to different project requist
## Repository Information 

**Owner:** [Basem Mostafa](https://github.com/BasemMostafaMorsi)

**Repository Url :**[automation exercise test](https://github.com/BasemMostafaMorsi/Demo-Blaze)

**Primary Languag :** java

## ✅Features

✔️ Framework Architecture – Developed using Java, Selenium, TestNG, and Maven, focusing on maintainability and scalability.

✔️ Design Patterns – Page Object Model (POM) and Fluent Pattern Approach for clean and scalable code.

✔️ Reusable Utilities – Smart actions for waits and element interactions for reliable and stable tests.

✔️ WebDriver Factory & Thread-Safety – For stable execution across browsers and driver management.

✔️ Comprehensive End-to-End Testing – Covers login, products, cart, checkout, and completion workflows using Data-Driven Testing (DDT) achieving high coverage.

✔️ Structured Logging – Log4j Integration for detailed logs and Custom Listeners for test monitoring.

✔️ Clear Reporting – Allure Reports providing real-time execution insights, step-level reporting, and failure analysis.

## Core Tech Stack :

💠 Java | Selenium WebDriver | TestNG | Maven

💠 Page Object Model (POM) | Fluent Pattern | Factory Pattern

💠 Data-Driven Testing | Log4j | Allure Reports | XML suite

## 🧱 Project Structure
├── New folder/ (7000 tokens)
    ├── HEAD
    ├── description
    ├── config
    ├── hooks/ (6700 tokens)
    │   ├── post-update.sample
    │   ├── pre-merge-commit.sample
    │   ├── pre-applypatch.sample
    │   ├── applypatch-msg.sample (200 tokens)
    │   ├── pre-receive.sample (200 tokens)
    │   ├── commit-msg.sample (200 tokens)
    │   ├── pre-push.sample (400 tokens)
    │   ├── prepare-commit-msg.sample (400 tokens)
    │   ├── pre-commit.sample (400 tokens)
    │   ├── sendemail-validate.sample (600 tokens)
    │   ├── push-to-checkout.sample (700 tokens)
    │   ├── update.sample (900 tokens)
    │   ├── fsmonitor-watchman.sample (1200 tokens)
    │   └── pre-rebase.sample (1200 tokens)
    └── info/ (100 tokens)
    │   └── exclude
├── test-output/ (14100 tokens)
    ├── full-report/ (11400 tokens)
    │   ├── data/ (4000 tokens)
    │   │   ├── categories.csv
    │   │   ├── categories.json
    │   │   ├── behaviors.csv
    │   │   ├── suites.csv
    │   │   ├── behaviors.json (200 tokens)
    │   │   ├── packages.json (200 tokens)
    │   │   ├── timeline.json (200 tokens)
    │   │   ├── suites.json (200 tokens)
    │   │   ├── attachments/ (1900 tokens)
    │   │   │   ├── 20e463ae4c475ffc.txt (700 tokens)
    │   │   │   └── c599a1a11d4e2796.txt (1200 tokens)
    │   │   └── test-cases/ (1000 tokens)
    │   │   │   └── aa8ce6ae21de8406.json (1000 tokens)
    │   ├── widgets/ (1500 tokens)
    │   │   ├── executors.json
    │   │   ├── launch.json
    │   │   ├── behaviors.json
    │   │   ├── categories.json
    │   │   ├── suites.json
    │   │   ├── environment.json
    │   │   ├── summary.json
    │   │   ├── duration.json
    │   │   ├── severity.json
    │   │   ├── status-chart.json
    │   │   ├── categories-trend.json
    │   │   ├── duration-trend.json (200 tokens)
    │   │   ├── retry-trend.json (200 tokens)
    │   │   └── history-trend.json (400 tokens)
    │   ├── favicon.ico
    │   ├── export/ (400 tokens)
    │   │   ├── mail.html
    │   │   ├── prometheusData.txt
    │   │   └── influxDbData.txt (200 tokens)
    │   ├── history/ (900 tokens)
    │   │   ├── categories-trend.json
    │   │   ├── duration-trend.json (200 tokens)
    │   │   ├── retry-trend.json (200 tokens)
    │   │   └── history-trend.json (400 tokens)
    │   ├── plugin/ (4200 tokens)
    │   │   ├── screen-diff/ (1900 tokens)
    │   │   │   ├── styles.css (200 tokens)
    │   │   │   └── index.js (1700 tokens)
    │   │   ├── packages/ (800 tokens)
    │   │   │   └── index.js (800 tokens)
    │   │   └── behaviors/ (1500 tokens)
    │   │   │   └── index.js (1500 tokens)
    │   └── index.html (300 tokens)
    └── allure-results/ (2700 tokens)
    │   ├── 23548982-8850-4e48-a48a-9771a7cdbea8-container.json
    │   ├── e477adb4-27bb-4467-8f86-6ef9a9b7a068-container.json
    │   ├── 83934e0e-57d3-413d-8213-f13401df2ba0-container.json
    │   ├── environment.xml
    │   ├── e3095045-c466-4812-b35c-f04cf6ab46a5-container.json
    │   ├── history/ (900 tokens)
    │       ├── categories-trend.json
    │       ├── duration-trend.json (200 tokens)
    │       ├── retry-trend.json (200 tokens)
    │       └── history-trend.json (400 tokens)
    │   ├── c750172e-6077-40bd-bbd2-8d53a11ad9ae-container.json (200 tokens)
    │   ├── f9b90ef1-9c20-4845-a05d-7e9934b65712-result.json (300 tokens)
    │   └── 9226e6af-4979-4ce7-96e8-7fe6b3bdba30-attachment.txt (800 tokens)
├── src/ (26600 tokens)
    ├── main/ (23400 tokens)
    │   ├── resources/ (1000 tokens)
    │   │   ├── waits.properties
    │   │   ├── db.properties
    │   │   ├── seleniumGrid.properties
    │   │   ├── video.properties
    │   │   ├── META-INF/ (100 tokens)
    │   │   │   └── services/ (100 tokens)
    │   │   │   │   └── org.testng.ITestNGListener
    │   │   ├── allure.properties
    │   │   ├── environment.properties
    │   │   ├── extensions/ (100 tokens)
    │   │   │   └── HaramBlur.crx
    │   │   ├── webapp.properties
    │   │   └── log4j2.properties (300 tokens)
    │   └── java/ (22400 tokens)
    │   │   └── com/ (22400 tokens)
    │   │       └── demoBlaze/ (22400 tokens)
    │   │           ├── drivers/ (3900 tokens)
    │   │               ├── WebDriverProvider.java
    │   │               ├── UITest.java
    │   │               ├── AbstractDriver.java (200 tokens)
    │   │               ├── Browser.java (200 tokens)
    │   │               ├── SafariFactory.java (400 tokens)
    │   │               ├── GUIDriver.java (500 tokens)
    │   │               ├── FirefoxFactory.java (700 tokens)
    │   │               ├── EdgeFactory.java (800 tokens)
    │   │               └── ChromeFactory.java (900 tokens)
    │   │           ├── pages/ (3500 tokens)
    │   │               ├── AboutUsPage.java
    │   │               ├── ProductsPage.java (300 tokens)
    │   │               ├── ContactPage.java (300 tokens)
    │   │               ├── LoginPage.java (300 tokens)
    │   │               ├── CategoriesPage.java (300 tokens)
    │   │               ├── SignUpPage.java (300 tokens)
    │   │               ├── PaceOrderPage.java (400 tokens)
    │   │               ├── ProductDetailsPage.java (400 tokens)
    │   │               ├── CartPage.java (500 tokens)
    │   │               └── components/ (600 tokens)
    │   │               │   └── NavigationBarComponents.java (600 tokens)
    │   │           ├── utils/ (8400 tokens)
    │   │               ├── TimeManager.java
    │   │               ├── OSUtils.java (200 tokens)
    │   │               ├── TerminalUtils.java (200 tokens)
    │   │               ├── dataReader/ (1000 tokens)
    │   │               │   ├── ExcelReader.java (300 tokens)
    │   │               │   ├── JsonReader.java (300 tokens)
    │   │               │   └── PropertyReader.java (400 tokens)
    │   │               ├── report/ (3100 tokens)
    │   │               │   ├── AllureEnvironmentManager.java (300 tokens)
    │   │               │   ├── AllureConstants.java (400 tokens)
    │   │               │   ├── AllureAttachmentManager.java (500 tokens)
    │   │               │   ├── AllureReportGenerator.java (700 tokens)
    │   │               │   └── AllureBinaryManager.java (1200 tokens)
    │   │               ├── logs/ (300 tokens)
    │   │               │   └── LogsManager.java (300 tokens)
    │   │               ├── WaitManager.java (300 tokens)
    │   │               └── actions/ (3200 tokens)
    │   │               │   ├── BrowserActions.java (600 tokens)
    │   │               │   ├── FrameActions.java (600 tokens)
    │   │               │   ├── AlertActions.java (700 tokens)
    │   │               │   └── ElementActions.java (1300 tokens)
    │   │           ├── validations/ (1200 tokens)
    │   │               ├── Verification.java (200 tokens)
    │   │               ├── Validation.java (400 tokens)
    │   │               └── BaseAssertion.java (600 tokens)
    │   │           ├── apis/ (1800 tokens)
    │   │               ├── Builder.java (200 tokens)
    │   │               └── UserManagementAPI.java (1600 tokens)
    │   │           ├── media/ (1600 tokens)
    │   │               ├── ScreenshotsManager.java (600 tokens)
    │   │               └── ScreenRecordManager.java (1000 tokens)
    │   │           ├── FileUtils.java (900 tokens)
    │   │           └── listeners/ (1100 tokens)
    │   │               └── TestNGListeners.java (1100 tokens)
    └── test/ (3200 tokens)
    │   ├── resources/ (300 tokens)
    │       └── test-data/ (300 tokens)
    │       │   ├── contact-data.json
    │       │   ├── signUp-data.json
    │       │   └── login-data.json
    │   └── java/ (2900 tokens)
    │       └── com/ (2900 tokens)
    │           └── automationexercices/ (2900 tokens)
    │               └── tests/ (2900 tokens)
    │                   ├── BaseTest.java (200 tokens)
    │                   └── ui/ (2700 tokens)
    │                       ├── LoginTest.java (300 tokens)
    │                       ├── CategoriesTest.java (300 tokens)
    │                       ├── RegisterTest.java (400 tokens)
    │                       ├── ContactTest.java (400 tokens)
    │                       ├── ProductDetailsTest.java (400 tokens)
    │                       ├── ProductTest.java (400 tokens)
    │                       └── CartTest.java (500 tokens)
├── .idea/ (500 tokens)
    ├── .gitignore
    ├── vcs.xml
    ├── copilot.data.migration.ask2agent.xml
    ├── encodings.xml
    └── misc.xml (200 tokens)
├── .gitignore (200 tokens)
└── pom.xml (1800 tokens)
