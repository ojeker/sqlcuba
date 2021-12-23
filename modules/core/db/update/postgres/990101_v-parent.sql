DROP VIEW IF EXISTS public.sqlcuba_parent_v;

CREATE VIEW public.sqlcuba_parent_v AS

WITH

children_props AS (
    SELECT
        count(*) AS num_children,
        sum(sc.age) AS sum_age,
        sc.parent_id
    FROM
        sqlcuba_child sc
    GROUP BY
        sc.parent_id
)

SELECT
    p.*,
    c.*
FROM
    sqlcuba_parent p
JOIN
    children_props c ON p.id = c.parent_id;