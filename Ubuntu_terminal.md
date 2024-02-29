## Задание
# 1. Использование команды cat
* Используя команду cat в терминале операционной системы Linux, создать
два файла Домашние животные (заполнив файл собаками, кошками,
хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и
ослы).

`$ cat > Pets`

> Sobani - Akitas, Husky's, Saluki's
>
> Cats - British's, Oriental's, Munchkins.
>
> Hamsters - Jungarians, other types.

`$ cat > Pack-animals`

>Horses - some horses.
>
>Camels - some camels.
>
>Donkeys - some donkeys.

* А затем объединить их.

`$ cat Pets >> Pack-animals`

* Просмотреть содержимое созданного файла.

`$ tail Pack-animals` 

>Horses - some horses.
>
>Camels - some camels.
>
>Donkeys - some donkeys.
>
>Sobani - Akitas, Husky's, Saluki's
>
>Cats - British's, Oriental's, Munchkins.
>
>Hamsters - Jungarians, other types.
>

* Переименовать файл, дав ему новое имя (Друзья человека).

`$ mv Pack-animals HumanFriends`

# 2. Работа с директориями в Linux
* Создать директорию, переместить файл туда.

`$ mkdir newdir`

`$ mv HumanFriends newdir/`

# 3. Подключить дополнительный репозиторий MySQL. Установить любой пакет из этого репозитория.
