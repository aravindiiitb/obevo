//// METADATA DISABLE_QUOTED_IDENTIFIERS
//// CHANGE name=init
CREATE TABLE TestTable
(
	idField INT NOT NULL,
	stringField VARCHAR(100),
	stringDateField DATE NULL,
	dateTimeField DATETIME NULL,
	myBooleanCol INT NULL,
	tinyIntCol tinyint NOT NULL,
	timeUpdated DATETIME NOT NULL,
	textField TEXT NULL,
	CONSTRAINT TestTable_PK PRIMARY KEY (idField)
)
GO
sp_bindefault 'DateDefault', 'TestTable.stringDateField'
GO
sp_bindrule booleanRule, 'TestTable.myBooleanCol'
GO

CREATE INDEX IND1 ON TestTable(stringField)
GO
DROP INDEX TestTable.IND1
GO
CREATE INDEX IND1 ON TestTable(stringField)
GO

//// CHANGE name=modify
ALTER TABLE TestTable ADD myNewCol2 INT NULL
GO

//// CHANGE name=rename excludeEnvs="unittest*"
sp_rename 'TestTable.myNewCol2', 'myNewCol'
GO

//// CHANGE name=rename includeEnvs="unittest*"
ALTER TABLE TestTable ALTER COLUMN myNewCol2 RENAME TO myNewCol
GO

//// CHANGE TRIGGER name=trigger1
create trigger TestTableTrigger1
on TestTable
for insert
as
print "Added!"
