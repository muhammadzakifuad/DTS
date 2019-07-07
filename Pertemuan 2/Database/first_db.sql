BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "matakuliah" (
	"id_matkul"	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	"nama_matkul"	TEXT,
	"sks_matkul"	INTEGER,
	"pengajar_matkul"	TEXT
);
CREATE TABLE IF NOT EXISTS "lab" (
	"id_lab"	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	"nama_lab"	TEXT,
	"ketua_lab"	TEXT,
	"sekretaris_lab"	TEXT
);
CREATE TABLE IF NOT EXISTS "prodi" (
	"id_prodi"	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	"nama_prodi"	TEXT,
	"ketua_prodi"	TEXT,
	"sekretaris_prodi"	TEXT
);
CREATE TABLE IF NOT EXISTS "jurusan" (
	"id_jurusan"	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	"nama_jurusan"	TEXT,
	"ketua_jurusan"	TEXT,
	"sekretaris_jurusan"	TEXT
);
CREATE TABLE IF NOT EXISTS "mahasiswa" (
	"nim"	TEXT NOT NULL,
	"nama"	TEXT,
	"tempat_lahir"	TEXT,
	"no_hp"	NUMERIC,
	PRIMARY KEY("nim")
);
INSERT INTO "mahasiswa" VALUES ('1',NULL,NULL,NULL);
INSERT INTO "mahasiswa" VALUES ('2',NULL,NULL,NULL);
INSERT INTO "mahasiswa" VALUES ('3',NULL,NULL,NULL);
COMMIT;
