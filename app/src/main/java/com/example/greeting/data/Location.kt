package com.example.greeting.data

data class Location (
    val id: Int,
    val name: String,
    val latitude: Double,
    val longitude: Double,
    val timestamp: Long
)

fun createRealJejuLocationData(): List<Location> {
    val jejuLocations = listOf(
        Location(0, "넥슨컴퓨터박물관", 33.47177, 126.48499, System.currentTimeMillis()),
        Location(1,"제주국제공항", 33.51135, 126.49277, System.currentTimeMillis()),
        Location(2, "한라산", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(3, "성산일출봉", 33.45804, 126.94260, System.currentTimeMillis()),
        Location(4, "만장굴", 33.52873, 126.77163, System.currentTimeMillis()),
        Location(5, "우도", 33.50649, 126.95300, System.currentTimeMillis ()),
        Location(6,"천지연폭포", 33.24605, 126.5432, System.currentTimeMillis()),
        Location(7, "중문관광단지", 33.25468, 126.41256, System.currentTimeMillis()),
        Location(8, "섭지코지" , 33.43411, 126.92770, System.currentTimeMillis()),
        Location(9, "한림공원", 33.39656, 126.23961, System.currentTimeMillis()),
        Location(10, "비자림", 33.48894, 126.80959, System.currentTimeMillis()),
        Location(11, "오설록티뮤지엄", 33.30599, 126.28947, System.currentTimeMillis()),
        Location(12, "사려니숲길", 33.42263, 126.62675, System.currentTimeMillis()),
        Location(13, "제주올레길", 33.48902, 126.49830, System.currentTimeMillis()),
        Location(14, "에코랜드", 33.44785, 126.67157, System.currentTimeMillis()),
        Location(15, "테디베어뮤지엄", 33.25046, 126.41457, System.currentTimeMillis()),
        Location(16, "카멜리아힐" , 33.28959, 126.37053, System.currentTimeMillis()),
        Location(17, "협재해수욕장", 33.39363, 126.23986, System.currentTimeMillis()),
        Location(18, "항덕해수욕장" , 33.54306, 126.66822, System.currentTimeMillis()),
        Location(19, "소인국테마파크", 33.25318, 126.40823, System.currentTimeMillis()),
        Location(20, "이호테우해변", 33.47772, 126.45677, System.currentTimeMillis()),
        Location(21, "정방폭포", 33.23700, 126.62005, System.currentTimeMillis()),
        Location(22, "마라도", 33.11881, 126.26855, System.currentTimeMillis()),
        Location(23, "산방산", 33.24681, 126.57082, System.currentTimeMillis()),
        Location(24, "용두암", 33.51622, 126.51448, System.currentTimeMillis()),

        Location(25,"제주국제공항", 33.51135, 126.49277, System.currentTimeMillis()),
        Location(26, "한라산", 33.36250, 126.53369, System.currentTimeMillis()),
        Location(27, "성산일출봉", 33.45804, 126.94260, System.currentTimeMillis()),
        Location(28, "만장굴", 33.52873, 126.77163, System.currentTimeMillis()),
        Location(29, "우도", 33.50649, 126.95300, System.currentTimeMillis ()),
        Location(30,"천지연폭포", 33.24605, 126.5432, System.currentTimeMillis()),
        Location(31, "중문관광단지", 33.25468, 126.41256, System.currentTimeMillis()),
        Location(32, "섭지코지" , 33.43411, 126.92770, System.currentTimeMillis()),
        Location(33, "한림공원", 33.39656, 126.23961, System.currentTimeMillis()),
        Location(34, "비자림", 33.48894, 126.80959, System.currentTimeMillis()),
        Location(35, "오설록티뮤지엄", 33.30599, 126.28947, System.currentTimeMillis()),
        Location(36, "사려니숲길", 33.42263, 126.62675, System.currentTimeMillis()),
        Location(37, "제주올레길", 33.48902, 126.49830, System.currentTimeMillis()),
        Location(38, "에코랜드", 33.44785, 126.67157, System.currentTimeMillis()),
        Location(39, "테디베어뮤지엄", 33.25046, 126.41457, System.currentTimeMillis()),
        Location(40, "카멜리아힐" , 33.28959, 126.37053, System.currentTimeMillis()),
        Location(41, "협재해수욕장", 33.39363, 126.23986, System.currentTimeMillis()),
        Location(42, "항덕해수욕장" , 33.54306, 126.66822, System.currentTimeMillis()),
        Location(43, "소인국테마파크", 33.25318, 126.40823, System.currentTimeMillis()),
        Location(44, "이호테우해변", 33.47772, 126.45677, System.currentTimeMillis()),
        Location(45, "정방폭포", 33.23700, 126.62005, System.currentTimeMillis()),
        Location(46, "마라도", 33.11881, 126.26855, System.currentTimeMillis()),
        Location(47, "산방산", 33.24681, 126.57082, System.currentTimeMillis()),
        Location(48, "용두암", 33.51622, 126.51448, System.currentTimeMillis())
    )
    return jejuLocations
}