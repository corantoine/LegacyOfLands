```mermaid
---
title: Legacy Of Lands
---
classDiagram
Constructible <|.. Batiments : implements
Batiments <|-- Atelier : extends
Batiments <|-- Caserne : extends
Batiments <|-- Ferme : extends
Batiments <|-- Maison : extends
Batiments <|-- MurDeDefense : extends
Batiments <|-- Commerce : extends


class Batiments
<<abstract>> Batiments
Batiments : -Unite uniteDansBatiment

class Constructible
<<interface>> Constructible
Constructible : ~construire()
Constructible : ~actionDuBatiment()

class Ferme
Ferme : -String nourriture
Ferme : +produireRessources()

class TypeRessources{
<<enum>>
BOIS
PIERRE
NOURRITURE
FER
OR
}


class Collectable
<<interface>> Collectable
Collectable : collecter()



Unites <|-- Artisan : extends
Soldat <|-- Chef : extends 
Unites <|-- Eclaireur : extends
Unites <|-- Soldat : extends
Unites <|-- Villageois : extends
TousLesTypesDeBatiments <|.. TypeBatiment : implements
Unites --> TypeBatiment

class Unites
<<abstract>> Unites
Unites : ~TypeBatiment currentBuilding
Unites : +String nom
Unites : +seDeplacer()
Unites : +travailler()
Unites : +seReposer(TypeBatiment type)
Unites : +recolter()

class Artisan
Artisan : +String nom

class Eclaireur
Eclaireur : +String nom

class Villageois
Villageois : +String nom

class Soldat
Soldat : +String nom


class Chef
Chef : +buff()
Chef : +String nom

class TypeBatiment{
<<enum>>
   ATELIER
   CASERNE
   FERME
   MAISON
   MURDEDEFENSE
   VILLAGE
   MAISONATTITREE
   TERRESINCONNUES
}

class Quetes{
-String nomDeLaQuete
-String descriptionDeLaQuete
-String recompenseDeQuete
-Unites uniteAssignee
+afficherDetailsQuetes()
}

class Marchand{
-bool marchandIsHere
}