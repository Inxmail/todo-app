CREATE SEQUENCE "PUBLIC"."TODO_LIST_SEQ" START WITH 1 RESTART WITH 101 INCREMENT BY 50;
CREATE SEQUENCE "PUBLIC"."TODO_SEQ" START WITH 1 RESTART WITH 101 INCREMENT BY 50;
CREATE
    MEMORY TABLE "PUBLIC"."TODO"
(
    "COMPLETED"   BOOLEAN NOT NULL,
    "ID"          BIGINT  NOT NULL,
    "TODOLIST_ID" BIGINT,
    "TITLE"       CHARACTER VARYING(255)
);
ALTER TABLE "PUBLIC"."TODO"
    ADD CONSTRAINT "CONSTRAINT_2" PRIMARY KEY ("ID");
-- 18 +/- SELECT COUNT(*) FROM PUBLIC.TODO;
INSERT INTO "PUBLIC"."TODO"
VALUES (FALSE, 1, 1, 'Brokkoli'),
       (FALSE, 2, 1, 'Steak'),
       (FALSE, 3, 1, 'Penne'),
       (FALSE, 4, 1, 'Karotten'),
       (FALSE, 5, 2, 'Unterhosen'),
       (FALSE, 6, 2, 'Zahnbuerste'),
       (FALSE, 7, 2, 'Socken'),
       (FALSE, 8, 2, 'Ladekabel'),
       (FALSE, 9, 2, 'PC'),
       (FALSE, 10, 2, 'Sonnenbrille'),
       (FALSE, 11, 3, 'Ticket Review'),
       (FALSE, 12, 3, 'Ticket Refinement'),
       (FALSE, 13, 3, 'Backend REST Endpunkt implementieren'),
       (FALSE, 14, 3, 'Frontend Funktionalitaet umsetzen'),
       (FALSE, 15, 3, 'Frontend Styling optimieren'),
       (FALSE, 16, 4, 'Katze fuettern'),
       (FALSE, 17, 4, 'Bier kaufen'),
       (FALSE, 18, 4, 'Vertrag unterschreiben');
CREATE
    MEMORY TABLE "PUBLIC"."TODO_LIST"
(
    "COMPLETED" BOOLEAN NOT NULL,
    "ID"        BIGINT  NOT NULL,
    "NAME"      CHARACTER VARYING(255)
);
ALTER TABLE "PUBLIC"."TODO_LIST"
    ADD CONSTRAINT "CONSTRAINT_4" PRIMARY KEY ("ID");
-- 4 +/- SELECT COUNT(*) FROM PUBLIC.TODO_LIST;
INSERT INTO "PUBLIC"."TODO_LIST"
VALUES (FALSE, 1, 'Einkaufen'),
       (FALSE, 2, 'Packliste Urlaub'),
       (FALSE, 3, 'Bewerber Aufgaben'),
       (FALSE, 4, 'Wichtiges');
ALTER TABLE "PUBLIC"."TODO"
    ADD CONSTRAINT "FKKJQFA0E1AGCOSMONMOH2ICP6V" FOREIGN KEY ("TODOLIST_ID") REFERENCES "PUBLIC"."TODO_LIST" ("ID") NOCHECK;