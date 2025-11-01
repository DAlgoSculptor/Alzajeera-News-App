# 📱 Alzajeera News App

<div align="center">

![App Icon](https://img.shields.io/badge/Alzajeera-News%20App-667eea?style=for-the-badge&logo=android&logoColor=white)

  <img src="https://github.com/DAlgoSculptor/Alzajeera-News-App/blob/main/app/src/main/res/drawable/home_page_modified1.png" alt="Alzajeera News App" width="420"/>

### 🚀 A Modern Android News Application

*Built with Kotlin & Jetpack Compose | Powered by NewsAPI.org*

[![Made with Kotlin](https://img.shields.io/badge/Kotlin-1.8.0-7F52FF?style=flat-square&logo=kotlin&logoColor=white)](https://kotlinlang.org/)
[![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-Latest-4285F4?style=flat-square&logo=jetpackcompose&logoColor=white)](https://developer.android.com/jetpack/compose)
[![Material 3](https://img.shields.io/badge/Material%203-Design-757575?style=flat-square&logo=material-design&logoColor=white)](https://m3.material.io/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=flat-square)](https://opensource.org/licenses/MIT)

</div>

---

## 📸 Screenshots

<div align="center">

  <table>
    <tr>
      <td align="center">
        <img src="https://github.com/DAlgoSculptor/Alzajeera-News-App/blob/main/app/src/main/res/drawable/home_page_modified2.png" width="350"/>
        <br />
        <sub><b>🏠 Home Screen</b></sub>
        <br />
        <sub>Modern Material 3 Design</sub>
      </td>
      <td align="center">
        <img src="https://github.com/DAlgoSculptor/Alzajeera-News-App/blob/main/app/src/main/res/drawable/home_page_modified3.png" width="350"/>
        <br />
        <sub><b>📰 News Article</b></sub>
        <br />
        <sub>Rich Content Display</sub>
      </td>
    </tr>
  </table>

</div>

---

## ✨ Features

<div align="center">

| Feature | Description |
|---------|-------------|
| 📱 **Modern UI** | Beautiful Material 3 Design with Jetpack Compose |
| 📰 **Real-time News** | Live feed from NewsAPI.org |
| 🔄 **Pull to Refresh** | Smooth refresh functionality |
| 🖼️ **Image Loading** | Fast loading with Coil library |
| 🌐 **Network Handling** | Robust error handling & retry |
| 📏 **Responsive Design** | Adapts to all screen sizes |
| 🎨 **Custom Theme** | Material 3 theming system |
| ⚡ **Performance** | Optimized with Kotlin Coroutines |

</div>

---

## 🛠️ Tech Stack

<div align="center">

```mermaid
graph LR
    A[Kotlin] --> B[Jetpack Compose]
    B --> C[Material 3]
    A --> D[Coroutines]
    A --> E[Retrofit]
    E --> F[NewsAPI]
    B --> G[Coil]
    A --> H[MVVM Architecture]
```

</div>

### Core Technologies

<table>
  <tr>
    <td align="center" width="20%">
      <img src="https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white"/>
      <br /><b>Kotlin</b>
    </td>
    <td align="center" width="20%">
      <img src="https://img.shields.io/badge/Jetpack%20Compose-4285F4?style=for-the-badge&logo=jetpackcompose&logoColor=white"/>
      <br /><b>Jetpack Compose</b>
    </td>
    <td align="center" width="20%">
      <img src="https://img.shields.io/badge/Retrofit-48B983?style=for-the-badge&logo=square&logoColor=white"/>
      <br /><b>Retrofit</b>
    </td>
    <td align="center" width="20%">
      <img src="https://img.shields.io/badge/Coil-000000?style=for-the-badge&logo=coil&logoColor=white"/>
      <br /><b>Coil</b>
    </td>
    <td align="center" width="20%">
      <img src="https://img.shields.io/badge/MVVM-FF6B6B?style=for-the-badge&logo=architecture&logoColor=white"/>
      <br /><b>MVVM</b>
    </td>
  </tr>
</table>

---

## 📁 Project Architecture

<div align="center">

```mermaid
graph TB
    ROOT[📦 app/]
    
    MODEL[📂 model/]
    M1[📄 NewsArticle.kt]
    M2[📄 NewsResponse.kt]
    M3[📄 NewsApiService.kt]
    
    VIEW[📂 view/]
    V1[📄 NewsScreen.kt]
    
    VIEWMODEL[📂 viewmodel/]
    VM1[📄 NewsViewModel.kt]
    
    THEME[📂 ui/theme/]
    T1[📄 Color.kt]
    T2[📄 Theme.kt]
    T3[📄 Type.kt]
    
    MAIN[📄 MainActivity.kt]
    
    ROOT --> MODEL
    ROOT --> VIEW
    ROOT --> VIEWMODEL
    ROOT --> THEME
    ROOT --> MAIN
    
    MODEL --> M1
    MODEL --> M2
    MODEL --> M3
    
    VIEW --> V1
    
    VIEWMODEL --> VM1
    
    THEME --> T1
    THEME --> T2
    THEME --> T3
    
    style ROOT fill:#667eea,stroke:#5568d3,stroke-width:3px,color:#fff
    style MODEL fill:#4ade80,stroke:#22c55e,stroke-width:2px,color:#000
    style VIEW fill:#60a5fa,stroke:#3b82f6,stroke-width:2px,color:#000
    style VIEWMODEL fill:#f59e0b,stroke:#d97706,stroke-width:2px,color:#000
    style THEME fill:#ec4899,stroke:#db2777,stroke-width:2px,color:#fff
    style MAIN fill:#8b5cf6,stroke:#7c3aed,stroke-width:2px,color:#fff
```

</div>

---

## 🚀 Getting Started

### Prerequisites

<div align="center">

| Requirement | Version |
|------------|---------|
| 🔧 Android Studio | Flamingo+ |
| 🔷 Kotlin | 1.8.0+ |
| 🏗️ Gradle | 8.11.1+ |
| 📱 Min SDK | 24 (Android 7.0) |
| 🎯 Target SDK | 34 (Android 14) |

</div>

### Installation Steps

1️⃣ **Clone the repository**
```bash
git clone https://github.com/DAlgoSculptor/Alzajeera-News-App.git
cd Alzajeera-News-App
```

2️⃣ **Get your API Key**
- Visit [NewsAPI.org](https://newsapi.org/)
- Sign up for a free API key

3️⃣ **Add API Key**
- Open `NewsRepository.kt`
- Replace `YOUR_API_KEY_HERE` with your actual API key:
```kotlin
private val apiKey = "your_actual_api_key_here"
```

4️⃣ **Build & Run**
- Open project in Android Studio
- Sync Gradle
- Run on emulator or device

---

## 📦 Dependencies

<details>
<summary><b>Click to expand dependencies</b></summary>

```gradle
dependencies {
    // Core Android
    implementation 'androidx.core:core-ktx:1.12.0'
    implementation 'androidx.lifecycle:lifecycle-runtime-ktx:2.7.0'
    
    // Compose
    implementation 'androidx.activity:activity-compose:1.8.2'
    implementation platform('androidx.compose:compose-bom:2024.02.00')
    implementation 'androidx.compose.ui:ui'
    implementation 'androidx.compose.ui:ui-tooling-preview'
    implementation 'androidx.compose.material3:material3'
    
    // Networking
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
    
    // Image Loading
    implementation 'io.coil-kt:coil-compose:2.5.0'
}
```

</details>

---

## 🎯 Key Features Breakdown

### 🏠 Home Screen
- ✅ Material 3 Design language
- ✅ Lazy column for efficient scrolling
- ✅ Pull-to-refresh functionality
- ✅ Loading states with progress indicators
- ✅ Error handling with retry option

### 📰 News Articles
- ✅ Rich image display
- ✅ Article title and description
- ✅ Source and timestamp
- ✅ Smooth animations
- ✅ Click to read more

### 🔧 Technical Features
- ✅ MVVM architecture pattern
- ✅ Kotlin Coroutines for async operations
- ✅ State management with ViewModel
- ✅ Retrofit for network calls
- ✅ Coil for image loading
- ✅ Material 3 theming system

---

## 📊 API Integration

<div align="center">

```mermaid
sequenceDiagram
    participant UI as NewsScreen
    participant VM as NewsViewModel
    participant Repo as NewsRepository
    participant API as NewsAPI
    
    UI->>VM: Request News
    VM->>Repo: fetchNews()
    Repo->>API: GET /v2/top-headlines
    API-->>Repo: NewsResponse
    Repo-->>VM: List<NewsArticle>
    VM-->>UI: Update State
    UI->>UI: Display Articles
```

</div>

### API Endpoints

| Endpoint | Method | Description |
|----------|--------|-------------|
| `/v2/top-headlines` | GET | Fetch latest news headlines |

**Parameters:**
- `country`: News country (default: `us`)
- `apiKey`: Your NewsAPI key

---

## 🎨 UI Components

<table>
  <tr>
    <th>Component</th>
    <th>Description</th>
    <th>Technology</th>
  </tr>
  <tr>
    <td>📄 <b>NewsScreen</b></td>
    <td>Main composable displaying news list</td>
    <td>Jetpack Compose</td>
  </tr>
  <tr>
    <td>🎴 <b>NewsCard</b></td>
    <td>Individual article card with image & text</td>
    <td>Material 3 Card</td>
  </tr>
  <tr>
    <td>🔄 <b>PullRefresh</b></td>
    <td>Swipe-to-refresh indicator</td>
    <td>Compose Material</td>
  </tr>
  <tr>
    <td>⚠️ <b>ErrorState</b></td>
    <td>Error display with retry button</td>
    <td>Custom Composable</td>
  </tr>
  <tr>
    <td>⏳ <b>LoadingState</b></td>
    <td>Circular progress indicator</td>
    <td>Material 3</td>
  </tr>
</table>

---

## 🤝 Contributing

Contributions are what make the open source community amazing!

<div align="center">

```mermaid
graph LR
    A[Fork] --> B[Create Branch]
    B --> C[Make Changes]
    C --> D[Commit]
    D --> E[Push]
    E --> F[Pull Request]
```

</div>

1. 🍴 Fork the Project
2. 🌿 Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. ✍️ Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. 🚀 Push to the Branch (`git push origin feature/AmazingFeature`)
5. 🎉 Open a Pull Request

---

## 📝 License

<div align="center">

Distributed under the MIT License. See `LICENSE` for more information.

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=for-the-badge)](https://opensource.org/licenses/MIT)

</div>

---

## 👨‍💻 Author

<div align="center">

### Danish Nawaz

[![GitHub](https://img.shields.io/badge/GitHub-DAlgoSculptor-181717?style=for-the-badge&logo=github)](https://github.com/DAlgoSculptor)
[![Portfolio](https://img.shields.io/badge/Portfolio-Visit-667eea?style=for-the-badge&logo=safari&logoColor=white)](https://github.com/DAlgoSculptor)

**Project Link:** [Alzajeera News App](https://github.com/DAlgoSculptor/Alzajeera-News-App)

</div>

---

## 🌟 Show Your Support

<div align="center">

If you like this project, please give it a ⭐ on GitHub!

[![GitHub stars](https://img.shields.io/github/stars/DAlgoSculptor/Alzajeera-News-App?style=social)](https://github.com/DAlgoSculptor/Alzajeera-News-App/stargazers)
[![GitHub forks](https://img.shields.io/github/forks/DAlgoSculptor/Alzajeera-News-App?style=social)](https://github.com/DAlgoSculptor/Alzajeera-News-App/network/members)

</div>

---

<div align="center">

### 📬 Have Questions?

Feel free to open an issue or reach out!

Made with ❤️ by [Danish Nawaz](https://github.com/DAlgoSculptor)

</div>