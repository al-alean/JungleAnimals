# JungleAnimals


Assessment Problem Definition – Part 1: 
 
Create the objects that you feel would best model a jungle using your best OO design and coding practices based on the following requirements.
Be ready to submit any and all work, including partial work, at the end of one hour.
1. The jungle contains several species of animals; tigers, monkeys and snakes.
2. All animals can do three things, make a sound, eat food, and sleep.
3. Each species of animal knows how many others of its kind exist.
4. By default when an animal’s energy level changes, it changes in the following ways:
     a. -3 for making a sound
     b. +5 for eating food
     c. +10 for sleeping
5. The jungle can perform a sound off. This involves all of the animals in the jungle each making their sound, along with reporting their energy level.
6. Tigers get +5 energy for sleeping.
7. Monkeys get +2 energy for eating and -4 energy for making a sound.
8. Some animals have the ability to play.
9. Only monkeys can play. When they do they say "Oooo Oooo Oooo" and get -8 energy. If a monkey doesn't have enough energy to play they say "Monkey is too tired".
10. The jungle contains several types of food; meat, fish, bugs and grain.
11. Tigers can't eat grain because they have sensitive digestive systems.
12. Bonus Item: The jungle can have each animal perform a random activity out of the ones possible for that animal. Include Unit tests if you would like to do so.
 
 "C:\Program Files\Java\jdk1.8.0_191\bin\java.exe" -Didea.launcher.port=56916 "-Didea.launcher.bin.path=C:\Program Files\Android\Android Studio\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\Admin\AppData\Local\Android\Sdk\platforms\android-28\android.jar;C:\Users\Admin\AppData\Local\Android\Sdk\platforms\android-28\data\res;C:\Users\Admin\AndroidStudioProjects\JungleAnimals\app\build\intermediates\javac\debug\compileDebugJavaWithJavac\classes;C:\Users\Admin\AndroidStudioProjects\JungleAnimals\app\build\generated\res\rs\debug;C:\Users\Admin\AndroidStudioProjects\JungleAnimals\app\build\generated\res\resValues\debug;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\customview-28.0.0.aar\1c1713a0abbbb92ea2f9cebb1b9158e5\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\localbroadcastmanager-28.0.0.aar\0e514292554a4d01638494fa5bf20fed\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\support-vector-drawable-28.0.0.aar\6a692e0e46bba508e6153e2461fdfb7a\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\interpolator-28.0.0.aar\39d689aa55d29d6022e9a90ad5439944\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\support-core-utils-28.0.0.aar\b900895e56ff81cdf8ee702b1eb0833b\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\support-core-ui-28.0.0.aar\fa8bc26e924f39086b2107e86eb26d0f\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\slidingpanelayout-28.0.0.aar\a1235200b39b8d1003ea1483197ca729\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\viewmodel-1.1.1.aar\735f437f4f6c4c07d559d5be898c564d\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\drawerlayout-28.0.0.aar\366c10b9a58c3cbb3c6111ae11fb6fbd\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\coordinatorlayout-28.0.0.aar\06c1b84432ed91bd4aa30a05afbe3a15\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\coordinatorlayout-28.0.0.aar\06c1b84432ed91bd4aa30a05afbe3a15\res;C:\Users\Admin\.gradle\caches\modules-2\files-2.1\com.android.support\collections\28.0.0\c1bcdade4d3cc2836130424a3f3e4182c666a745\collections-28.0.0.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\documentfile-28.0.0.aar\18cb469453cf72116b30c9c05d76cd55\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\swiperefreshlayout-28.0.0.aar\6a7bf75ef4b88af9bc5ed4689a60ae03\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\cursoradapter-28.0.0.aar\7e0453353a39d406404044ce3e7ebdcd\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\asynclayoutinflater-28.0.0.aar\986bd2bcb7d309e5c30208b7fbe1f500\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\livedata-1.1.1.aar\73ebca11905011e3e612cc5fd90af3cd\jars\classes.jar;C:\Users\Admin\.gradle\caches\modules-2\files-2.1\android.arch.core\common\1.1.1\e55b70d1f5620db124b3e85a7f4bdc7bd48d9f95\common-1.1.1.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\versionedparcelable-28.0.0.aar\6911d0e102e9da1621b95559ce615cb8\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\runtime-1.1.1.aar\a39c327502ea4c61af91ba7bc0a4731f\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\print-28.0.0.aar\5ed2e9f80a0a22aabbaa110a2d5b7ebd\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\loader-28.0.0.aar\4fbb5582baecb33bb2c8ca62a4a01b5a\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\viewpager-28.0.0.aar\e05f4d9248c35983b31ea804a78d04c1\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\support-fragment-28.0.0.aar\1d8c68f0e0eedce720debfb474128dca\jars\classes.jar;C:\Users\Admin\.gradle\caches\modules-2\files-2.1\com.android.support\support-annotations\28.0.0\ed73f5337a002d1fd24339d5fb08c2c9d9ca60d8\support-annotations-28.0.0.jar;C:\Users\Admin\.gradle\caches\modules-2\files-2.1\android.arch.lifecycle\common\1.1.1\207a6efae6a3555e326de41f76bdadd9a239cbce\common-1.1.1.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\livedata-core-1.1.1.aar\40683130997ece1ec4286cafc7a9768b\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\support-compat-28.0.0.aar\c40021877233145f0c7e7d7a25278920\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\support-compat-28.0.0.aar\c40021877233145f0c7e7d7a25278920\res;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\animated-vector-drawable-28.0.0.aar\8e75631c971d0060f05aae21d5c67abf\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\appcompat-v7-28.0.0.aar\e5d06ab0fe231ea223062cbd6759a30c\jars\classes.jar;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\appcompat-v7-28.0.0.aar\e5d06ab0fe231ea223062cbd6759a30c\res;C:\Users\Admin\.gradle\caches\transforms-1\files-1.1\runtime-1.1.1.aar\5b1c85111b07339a1d389f52ceea423f\jars\classes.jar;C:\Program Files\Android\Android Studio\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMainV2 com.example.admin.jungleanimals.MainClass
Tiger1
Tiger making sound ( -3)
Energy Level: -3
Tiger2
Tiger making sound ( -3)
Tigers don't eat grain ( 0)
Energy Level: -3
Tiger3
Tiger making sound ( -3)
Tiger sleeping ( +5)
Energy Level: 2
Tiger4
Tiger making sound ( -3)
Tiger eating meat ( +5)
Energy Level: 2
------------------------------------------
Monkey1
Monkey making sound ( -4)
Energy Level: -4
Monkey2
Monkey making sound ( -4)
Monkey eating grain ( +2)
Energy Level: -2
Monkey3
Monkey making sound ( -4)
Monkey sleeping ( +10)
Monkey is too tired
Energy Level: 6
Monkey4
Monkey sleeping ( +10)
Monkey playing Oooo Oooo Oooo  ( -8)
Energy Level: 2
------------------------------------------
Snake1
Snake making sound ( -3)
Energy level: -3
Snake2
Snake making sound ( -3)
Snake eating bugs ( +5)
Energy level: 2
Snake3
Snake making sound ( -3)
Snake eating meat ( +5)
Snake sleeping ( +10)
Energy level: 12

Process finished with exit code 0
