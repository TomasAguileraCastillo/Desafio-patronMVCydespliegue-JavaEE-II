--
-- PostgreSQL database dump
--

-- Dumped from database version 16.3 (Debian 16.3-1.pgdg120+1)
-- Dumped by pg_dump version 16.3

-- Started on 2024-08-21 19:47:41

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 218 (class 1259 OID 16428)
-- Name: direcciones; Type: TABLE; Schema: public; Owner: tomas
--

CREATE TABLE public.direcciones (
    id integer NOT NULL,
    nombre character varying(50),
    numeracion character varying(100),
    usuario_id integer
);


ALTER TABLE public.direcciones OWNER TO tomas;

--
-- TOC entry 217 (class 1259 OID 16427)
-- Name: direcciones_id_seq; Type: SEQUENCE; Schema: public; Owner: tomas
--

CREATE SEQUENCE public.direcciones_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.direcciones_id_seq OWNER TO tomas;

--
-- TOC entry 3373 (class 0 OID 0)
-- Dependencies: 217
-- Name: direcciones_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: tomas
--

ALTER SEQUENCE public.direcciones_id_seq OWNED BY public.direcciones.id;


--
-- TOC entry 219 (class 1259 OID 16447)
-- Name: roles_usuarios; Type: TABLE; Schema: public; Owner: tomas
--

CREATE TABLE public.roles_usuarios (
    usuario_id integer,
    rol_id integer
);


ALTER TABLE public.roles_usuarios OWNER TO tomas;

--
-- TOC entry 216 (class 1259 OID 16406)
-- Name: usuarios; Type: TABLE; Schema: public; Owner: tomas
--

CREATE TABLE public.usuarios (
    id integer NOT NULL,
    correo character varying(100) NOT NULL,
    create_at timestamp without time zone NOT NULL,
    nick character varying(100) NOT NULL,
    nombre character varying(180) NOT NULL,
    password character varying(180) NOT NULL,
    peso integer NOT NULL,
    updated_at timestamp without time zone NOT NULL
);


ALTER TABLE public.usuarios OWNER TO tomas;

--
-- TOC entry 215 (class 1259 OID 16405)
-- Name: usuarios_id_seq; Type: SEQUENCE; Schema: public; Owner: tomas
--

CREATE SEQUENCE public.usuarios_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.usuarios_id_seq OWNER TO tomas;

--
-- TOC entry 3374 (class 0 OID 0)
-- Dependencies: 215
-- Name: usuarios_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: tomas
--

ALTER SEQUENCE public.usuarios_id_seq OWNED BY public.usuarios.id;


--
-- TOC entry 3213 (class 2604 OID 16431)
-- Name: direcciones id; Type: DEFAULT; Schema: public; Owner: tomas
--

ALTER TABLE ONLY public.direcciones ALTER COLUMN id SET DEFAULT nextval('public.direcciones_id_seq'::regclass);


--
-- TOC entry 3212 (class 2604 OID 16409)
-- Name: usuarios id; Type: DEFAULT; Schema: public; Owner: tomas
--

ALTER TABLE ONLY public.usuarios ALTER COLUMN id SET DEFAULT nextval('public.usuarios_id_seq'::regclass);


--
-- TOC entry 3366 (class 0 OID 16428)
-- Dependencies: 218
-- Data for Name: direcciones; Type: TABLE DATA; Schema: public; Owner: tomas
--

COPY public.direcciones (id, nombre, numeracion, usuario_id) FROM stdin;
23	SDF1 fortress ala Norte	7943S. FifthStreet	1
24	SDF1 fortress	77 LymeStreet	2
25	SDF1 fortress	77 LymeStreet	3
26	SDF1 fortress	677 bridgefrotressStreet	3
27	Av. Matías Roman Barrera	8143 CollegeSt.	4
\.


--
-- TOC entry 3367 (class 0 OID 16447)
-- Dependencies: 219
-- Data for Name: roles_usuarios; Type: TABLE DATA; Schema: public; Owner: tomas
--

COPY public.roles_usuarios (usuario_id, rol_id) FROM stdin;
1	1
2	2
3	2
4	2
\.


--
-- TOC entry 3364 (class 0 OID 16406)
-- Dependencies: 216
-- Data for Name: usuarios; Type: TABLE DATA; Schema: public; Owner: tomas
--

COPY public.usuarios (id, correo, create_at, nick, nombre, password, peso, updated_at) FROM stdin;
2	hikaruIchijyo@sdf1.com	2024-08-07 00:00:00	Lider Skull1	Hikaru Ichijyo	RobotechVF1SValkyrie 	80	2024-08-07 00:00:00
1	royfocker@sdf1.com	2024-08-07 00:00:00	Skull1	Roy Focker	Valkyrie VF1	90	2024-08-07 00:00:00
3	misahayase@sdf1.com	2024-08-07 00:00:00	Lisa	Misa Hayase	SDF-1	65	2024-08-07 00:00:00
4	tomas@tomas.com	2024-08-07 00:00:00	Tomas Aguilera	Tomas Aguilera	1234	90	2024-08-07 00:00:00
\.


--
-- TOC entry 3375 (class 0 OID 0)
-- Dependencies: 217
-- Name: direcciones_id_seq; Type: SEQUENCE SET; Schema: public; Owner: tomas
--

SELECT pg_catalog.setval('public.direcciones_id_seq', 27, true);


--
-- TOC entry 3376 (class 0 OID 0)
-- Dependencies: 215
-- Name: usuarios_id_seq; Type: SEQUENCE SET; Schema: public; Owner: tomas
--

SELECT pg_catalog.setval('public.usuarios_id_seq', 4, true);


--
-- TOC entry 3217 (class 2606 OID 16433)
-- Name: direcciones direcciones_pkey; Type: CONSTRAINT; Schema: public; Owner: tomas
--

ALTER TABLE ONLY public.direcciones
    ADD CONSTRAINT direcciones_pkey PRIMARY KEY (id);


--
-- TOC entry 3215 (class 2606 OID 16411)
-- Name: usuarios usuarios_pkey; Type: CONSTRAINT; Schema: public; Owner: tomas
--

ALTER TABLE ONLY public.usuarios
    ADD CONSTRAINT usuarios_pkey PRIMARY KEY (id);


--
-- TOC entry 3218 (class 2606 OID 16434)
-- Name: direcciones ids; Type: FK CONSTRAINT; Schema: public; Owner: tomas
--

ALTER TABLE ONLY public.direcciones
    ADD CONSTRAINT ids FOREIGN KEY (usuario_id) REFERENCES public.usuarios(id);


--
-- TOC entry 3219 (class 2606 OID 16453)
-- Name: roles_usuarios idsroles; Type: FK CONSTRAINT; Schema: public; Owner: tomas
--

ALTER TABLE ONLY public.roles_usuarios
    ADD CONSTRAINT idsroles FOREIGN KEY (usuario_id) REFERENCES public.usuarios(id);


-- Completed on 2024-08-21 19:47:41

--
-- PostgreSQL database dump complete
--

