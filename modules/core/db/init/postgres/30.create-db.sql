DROP VIEW IF EXISTS sqlcuba_parent_v;

CREATE VIEW sqlcuba_parent_v AS
WITH

children_props AS (
  SELECT
    count(*) AS num_children,
    sum(age) AS sum_age,
    sc.parent_id
  FROM
    sqlcuba_child sc
  GROUP BY
    sc.parent_id
)

SELECT
  p.*,
  c.num_children,
  c.sum_age
FROM
  sqlcuba_parent p
INNER JOIN
  children_props c ON p.id = c.parent_id
;
