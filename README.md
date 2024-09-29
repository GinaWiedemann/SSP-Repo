# ESA Versionskontrolle
Softwaretechnik SS24 - Gina-Marie Wiedemann

## Aufgabe 1 - Repository in Github oder GitLab
Ich habe mich für diese Abgabe für Github entschieden, da ich GitLab durch andere Projekte der Hochschule bereits kennenlernen konnte und Github an sich noch ein offenes Buch für mich war.

## Aufgabe 2 - Eigenes Projekt pushen oder neues Projekt
Für die Aufgabe habe ich zuerst im ... ein neues Repository namens SSP-Repo (SteinScherePapier-Repository) erstellt, Git Bash auf meinem Rechner eingerichtet und mit "$ git init" das entsprechende Verzeichnis auf meinem PC initialisiert. (siehe Aufgabe 3 "Init")

## Aufgabe 3 - Methoden anwenden
### Schritt 1
![1_Init_add_status_commit_push](https://github.com/user-attachments/assets/986e59c7-5fd7-4ce0-924c-a8e4ef695a62)
#### Init
Für die Aufgabe habe ich zuerst auf github.com ein neues Repository namens SSP-Repo (SteinScherePapier-Repository) erstellt, Git Bash auf meinem Rechner eingerichtet und mit "$ git init" das entsprechende Verzeichnis auf meinem PC initialisiert.

#### Add
Im Anschluss habe ich alle Ordner und Dateien zum Repository hinzugefügt.

#### Status
Danach einen Status eingeholt, um zu schauen, ob auch alle Dateien gestaget wurden. Der Status besagt, dass eine neue Datei sich lokal im Repo befindet, diese jedoch nicht commitet wurden.

#### Commit
Folgend habe ich im nächsten Schritt meine gestageten Dateien commitet und mit der Commit-Nachricht "Erster Commit" versehen.

#### Remote add
Um mein Repository mit dem auf der Website angelegten Repository zu verbinden, habe ich das Website-Repository als Remote-Repository hinzugefügt.

#### Push
Und zum Schluss der erste Push, um meinen ersten lokalen Commit mit dem Server zu synchronisieren.

### Schritt 2
![2_Pull_Laptop1](https://github.com/user-attachments/assets/136d7ac2-7e65-467c-8db2-ec254e488286)
![3_Pull_Laptop2](https://github.com/user-attachments/assets/43641979-76a0-49d8-87c3-2d389887beb1)
#### Init
Auf meinem anderen Rechner habe ich, um den Befehl "§ git pull" auszuprobieren, einen Ordner als Repository initialisiert...

#### Pull
... Und im nächsten Schritt das Repository aus dem Online-Remote-Repository alle Inhalte gepullt.

### Schritt 3
![4_Status_Diff](https://github.com/user-attachments/assets/5a416383-48e2-4b3a-aa9b-f4d71617b13b)
![5_Commit_Push](https://github.com/user-attachments/assets/db5fe1df-2a31-461d-98a9-f0feea2acde7)
#### Status
Um nun auszutesten, wie sich Git verhält, wenn ich Änderungen an Dateien in meinem Repo durchführe und diese nicht gestaget habe, habe ich den Status-Befehl benutzt. Diese sagt, das SteinScherePapier.java verändert wurde, jedoch die Änderungen noch nicht gestaget wurden für den Commit. Es werden sogar Verschläge gegegben, wie ich weiter vorgehen soll (mit "add" oder "restore").

#### Diff
Aber was hat sich nun verändert? Dazu habe ich den Befehl "§ git diff" genommen, welcher mir in rot die alten Elemente anzeigt, die verändert wurden, und in grün die neuen Elemente, welche die roten ersetzt haben.

#### Commit
Die betrachteten Änderungen will ich nun commiten. Hierbei verweist mich Git jedoch darauf, das keine Änderungen für einen Commit vorliegen, aber die Dateien geändert und nicht gestaget wurden. Ich habe also vergessen, die Dateien mit "add" hinzuzufügen.

#### Add
Also stage ich meine veränderten Dateien...

#### Commit
... Und führe den Commit durch.

#### Push
Als letztes noch ein Push, um alles zu synchronisieren.

### Schritt 4
![6_Commit_Push2](https://github.com/user-attachments/assets/cd65753e-ca99-4199-b6ed-d5c9e1f6f7f3)
#### Add, Commit, Push
Für den weiteren Verlauf wird soll ein Logo-Ordner hinzugefügt werden.

### Schritt 7
![7_Pull](https://github.com/user-attachments/assets/7c2c2971-356a-4ebe-9c6a-0191f550fb01)
#### Pull
Im Remote-Repository wurde die README.md geändert. Um wieder uptodate zu sein, führe ich einen Pull-Befehl durch.

### Schritt 8
![8_Rm](https://github.com/user-attachments/assets/eaf33e05-9b8b-40c4-92e4-ef4d2b9536af)
#### Rm, Commit, Push
Der Auftraggeber des SteinScherePapier-Spiels ist nicht zufrieden mit dem Logo. Es soll vorerst entfernt werden auch solange noch keine Alternative vorliegt.
Dazu benutze ich den Befehl "$ git rm <Datei>", um das bisherige Logo aus dem Ordner "pics" zu löschen. Es folgt ein Commit und ein Push zum synchronisieren. 

## Aufgabe 5 - Branches
(Aufgabe 5 vor Aufgabe 4, da in 4 auf Änderungen aus Aufgabe 5 Bezug genommen wird)
### Schritt 1
![9_Branch1](https://github.com/user-attachments/assets/8b93a781-3f0d-4b9d-8c30-9fdbe504cbc1)
![10_Branch2](https://github.com/user-attachments/assets/120a86e0-3973-455c-9a2f-24aa4168f13e)
#### Pull
Da ein wenig Zeit vergangen ist, führe ich zuerst ein Pull-Befehl aus.

#### Branch 
Von dem Auftraggeber wird eine neue Idee mit eingebracht: Das Spiel soll um ein weiteres Symbol erweitert werden, um sich mehr von dem Klassiker abzuheben und ein Kaufwunsch entsteht.
Da wir dies jedoch ersteinmal ausprobieren, wird mit "§ git branch" ein neuer Branch namens "new-symbol" erstellt.

#### Log
Auf welchen Branch zeigt der HEAD jetzt nun? Um das in Erfahrung zu bringen, wird der Befehl "§ git log" in Verbingung mit "--decorate" verwendet. Hier sieht man, wohin die Zeiger der Branches zeigen. In meinem Fall zeigt HEAD auf den master-Branch.

#### Checkout
Um nun zu dem neuen Branch zu wechseln, verwende ich den Befehl "§ git checkout <Branchname>".

#### Add, Commit, Push
Hier füge ich die Änderungen hinzu, die ich für das Erstellen eines neuen zusätzlichen Symbols durchgeführt habe.

### Schritt 2
![11_Branch3](https://github.com/user-attachments/assets/c7cca547-d20d-4c1c-ad35-fd14513ca989)
#### Checkout, Add, Commit, Push
Vom Auftraggeber kommt nun die Vorschrift, dass die Ausgaben geändert werden sollen, da die vorherigen ihm nicht gängig genug waren. Da diese jedoch auf jeden Fall auf alles was folgt angewendet werden soll, gehen wir zurück auf den master-Branch mit checkout und fügen die Änderungen hinzu.

#### Checkout, Add, Commit, Push 
Für das neue Symbol werden noch Änderungen bei der Aufstellung der Cases durchgeführt, da die Gewinnlogik sich mit mehr Symbolen etwas anders darstellt.

### Schritt 3
![12_Branch4](https://github.com/user-attachments/assets/95bed59a-419a-4d34-bd07-eda6394c9a72)
![13_Branch5](https://github.com/user-attachments/assets/9624bd78-b3c2-4ac5-a56a-cc555d935fa1)
#### Checkout
Es wird wieder zum master-Branch gewechselt. 

#### Merge
Da das neue Symbol nun von dem Auftraggeber bestätigt ist, sollen die beiden Branches zusammengeführt werden. Dies kann mit dem Befehl "§ git merge <Branchname>" erzielt werden. In meinem Fall kam es jedoch zu einem Konflikt beim Zusammenfügen, da die neuen Cases und die neue Beschreibung des Cases sich nicht so einfach zusammenschließen lassen.

#### Versuche, die Branches zu mergen
Zum Beheben der Fehler wechsel ich zum Branch new-symbol, führe die Änderungen durch, damit der Merge funktioniert und commite. Da auch hier der Merge nicht so ganz funktioniert hat, bin zwischen den Branches hin un her gewechselt, habe die Datei noch einmal angepasst und einen weiteren Versuch zum Mergen gestartet, was am Ende funktioniert hat.


## Aufgabe 4 - Zeitreisen
### Schritt 1
![14_Zeitreise1](https://github.com/user-attachments/assets/25d929fa-4c94-4970-be56-47daee87fe96)
![15_Zeitreise2](https://github.com/user-attachments/assets/c052a946-3d26-49fb-bd8f-d554c35e4ea3)
Für die Symbole wurden Bilder hinzugefügt, die in Zukunft mit in das Programm eingepflegt werden soll. Ein Bild habe ich jedoch vergessen. Da ich keinen neuen Commit durchführen wollte, der nur besagt "Oops das und das vergessen", habe ich ihn mit "§ git commit --amend" nachträglich zum letzten Commit hinzugefügt.

### Schritt 2
![16_Zeitreise3](https://github.com/user-attachments/assets/7f03944a-ced1-457d-af37-2a347467ac00)
Hier wollte ich eigentlich die Variante ausprobieren, wo die Staging-Area noch einmal geleert wird, da das Stein.jpg die falsche Datei war, die hinzugefügt werden soll. Also sollte Stein.jpg unstaget werden und dafür Stein.png gestaget werden und direkt noch vor dem Änderungs-Commit bearbeitet werden. Da der Änderungs-Commit jedoch schon durchgeführt wurde, habe ich noch einmal den Befehl "§ git commit --amend" ausgeführt und den Commit ein weiteres Mal geändert. Hierbei wurde Stein.jpg entfernt und Stein.png stattdessen hinzugefügt.

### Schritt 3
![17_Zeitreise4](https://github.com/user-attachments/assets/6d38c267-9947-4e63-adf8-4897f7c47bd3)
![18_Zeitreise5](https://github.com/user-attachments/assets/10e25f1c-1ecb-4324-ac65-6d62c2eca241)
Der Auftraggeber will nun nachdem ein Marketing-Team über den Entwurf geschaut hat, statts auf Quantität (mehr Symbole) auf Qualität (neue Symbole mit mehr "Charakter") mit dem Projekt gehen. Die neuen Bezeichnungen der Cases sollen ersteinmal außen vor gelassen werden.
Für die Umsetzung der neuen Symbole ist es einfacher zurück in die Vergangenheit zu gehen (wo es noch 3 Fälle waren) und die Namen der Symbole einfach nach den Wünschen des Auftraggebers zu ändern.
Hierfür wurden mit "§ git log" die Commit-Nachrichten ausgelesen und die Commit-ID herausgesucht vor dem Punkt, wo es zu den neuen Branches kam.
Die Änderung bezüglich der Umbenennung der Symbole wurde durchgeführt und im Anschluss als neuer Branch "new-name" benannt.

## Aufgabe 6 - Pull-Request
Pull-Request-Link: https://github.com/edlich/education/pull/526; Pull-Request-Nummer: 526
![Pull_request](https://github.com/user-attachments/assets/20240622-fbc6-4020-8f3f-61ca398d0636)

## Zusatzinfos
Für einen ersten Überblick, für jemanden der zuvor noch nie wirklich mit Git (zumindest über die Konsole) gearbeitet hat, hat mir das Programm "Oh My Git" weitergeholfen. Sehr schöne Übungen und bekommt durch die Darstellungen eine sehr gute Vorstellung, die es dann im Repository aussieht.
Kann ich für Studierende ohne Erfahrung sehr empfehlen!
https://ohmygit.org/



