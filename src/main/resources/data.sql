INSERT INTO categorie( category) VALUES
 ( "Harcerskie"),
 ( "Chescijanskie"),
 ( "Szanty"),
 ( "Inne");

 INSERT INTO song( title, categorie_id) VALUES
 ("Płonie ognisko i szumią knieje",1),
 ("Błogosławcie Bogu",2),
 ("Tańcz gdy zabawa trwa",3);


INSERT INTO verse(text_of_verse, chords_of_verse, number_of_verse, song_id) VALUES
("Płonie ognisko i szumią knieje", "a E a",1,1),
("Drużynowy jest wśród nas.", "a E a (E)",2,1),
("Opowiada starodawne dzieje,", "a E a",3,1),
("Bohaterski wskrzesza czas.", "a E a (G)",4,1),

("Błogosławcie Bogu ", "g C",1,2),
("Radujcie się w Nim", "F B",2,2),
("Niebo ziemia niech zatańczą", "g A",3,2),
("Panu dziś ", "d",4,2),
("Błogosławcie Bogu", "g C",5,2),
("Radujcie się w Nim ", "F B",6,2),
("Ogłaszajcie Jego imię nam", "g A d",7,2),
("Śpiewajmy: chwała Bogu", "g C",8,2),
("Wychwalajmy Pana", "F B",9,2),
("On radością obdaruje nas", "g A d",10,2),

("Dzisiaj biała koszula, błyszczące buty,", "D GD",1,3),
("Prasowane mankiety i spodnie w kant.", "D GD",2,3),
("Wczoraj jeszcze na morzu, falą opluty,", "D GD",3,3),
("Dzisiaj idę pewnie przez miasto na bal.", "h AD",4,3),
("Jeszcze w głowie szum morza i kołysanie,", "D GD",5,3),
("Wiodło światła latarni w górę i w dół.", "D GD",6,3),
("A kapela przygrywa i tańczą panie,", "D GD",7,3),
("Tylko moje nogi są sztywne jak stół.", "h AD",8,3),
("Tańcz, tańcz, jak młode wino,", "D D",9,3),
("Tańcz, tańcz, gdy zabawa trwa,", "D GA",10,3),
("Tańcz, tańcz, ze mną dziewczyno,", "D D   (h h",11,3),
("Póki jeszcze muzyka nam gra.", "h AD  G AD)",12,3);
