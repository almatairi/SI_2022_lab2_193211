# SI_2022_lab2_193211
CFG
![Untitled Diagram drawio](https://user-images.githubusercontent.com/101112086/169914177-5b9d0f23-2b44-46ba-bcb6-668458dc86ce.png)

3. Цикломатската комплексност е 9. 8 предикатни јазли +1=9
4. За Every statement имаме 3 тест случаи. Прво ако листата е 0, должината на листата не е совршен квадрат и ако сите линии код во for циклусот се точни.


![everystatement](https://user-images.githubusercontent.com/101112086/169914375-fdfd2133-5581-4805-bf2f-e299685ad82a.png)

5.Исто и за Every branch имаме 3 тест случаи.


![everybranch](https://user-images.githubusercontent.com/101112086/169914892-b92f6370-3665-4bec-b86b-051d3624a7e1.png)




Го користев Exception testing со истите тест случаи како во EveryStatment и EveryBranch.
1-Должината на листата е 0 па е фрли IllegalArgumentException("List length should be greater than 0").
2-Условот за совршена квадратна листа не се исполнува па пак е фрли IllegalArgumentException("List length should be perfect square").
3-Со последниот тест се поминуваат сите услови во for циклусот.
