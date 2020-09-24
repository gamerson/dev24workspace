create index IX_8869B0F1 on SAMPLE_Sample (field2);
create index IX_8E9B0CB9 on SAMPLE_Sample (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_72C16D7B on SAMPLE_Sample (uuid_[$COLUMN_LENGTH:75$], groupId);