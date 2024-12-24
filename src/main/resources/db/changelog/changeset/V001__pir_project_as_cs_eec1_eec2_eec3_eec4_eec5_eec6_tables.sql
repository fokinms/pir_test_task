    create table if not exists projects
    (
        id bigint primary key generated always as identity unique,
        name varchar(255) not null,
        code varchar(64) unique not null,
        started_at timestamptz default current_timestamp,
        finished_at timestamptz,
        status smallint default 0 not null
    );

    create table if not exists as_project
    (
        id bigint primary key generated always as identity unique,
        project_id bigint not null,
        code varchar(64),
        created_at timestamptz default current_timestamp,
        constraint fk_project foreign key (project_id) references projects(id)
    );

    create table if not exists cs_project
    (
        id bigint primary key generated always as identity unique,
        project_id bigint not null,
        code varchar(64),
        created_at timestamptz default current_timestamp,
        constraint fk_project foreign key (project_id) references projects(id)
    );

    create table if not exists eec_1_project
    (
        id bigint primary key generated always as identity unique,
        project_id bigint not null,
        code varchar(64),
        created_at timestamptz default current_timestamp,
        constraint fk_project foreign key (project_id) references projects(id)
    );

    create table if not exists eec_2_project
    (
        id bigint primary key generated always as identity unique,
        project_id bigint not null,
        code varchar(64),
        created_at timestamptz default current_timestamp,
        constraint fk_project foreign key (project_id) references projects(id)
    );

    create table if not exists eec_3_project
    (
        id bigint primary key generated always as identity unique,
        project_id bigint not null,
        code varchar(64),
        created_at timestamptz default current_timestamp,
        constraint fk_project foreign key (project_id) references projects(id)
    );

    create table if not exists eec_4_project
    (
        id bigint primary key generated always as identity unique,
        project_id bigint not null,
        code varchar(64),
        created_at timestamptz default current_timestamp,
        constraint fk_project foreign key (project_id) references projects(id)
    );

    create table if not exists eec_5_project
    (
        id bigint primary key generated always as identity unique,
        project_id bigint not null,
        code varchar(64),
        created_at timestamptz default current_timestamp,
        constraint fk_project foreign key (project_id) references projects(id)
    );

    create table if not exists eec_6_project
    (
        id bigint primary key generated always as identity unique,
        project_id bigint not null,
        code varchar(64),
        created_at timestamptz default current_timestamp,
        constraint fk_project foreign key (project_id) references projects(id)
    );