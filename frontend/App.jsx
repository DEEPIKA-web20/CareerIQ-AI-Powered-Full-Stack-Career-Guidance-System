import { useState } from "react";
import { getCareer } from "./api";
import CareerCard from "./CareerCard";

function App() {

  const [skills, setSkills] = useState("");
  const [data, setData] = useState(null);

  const handleClick = async () => {
    const res = await getCareer(skills);
    setData(res.data);
  };

  return (
    <div style={{ textAlign: "center", marginTop: "50px" }}>

      <h1>🚀 CareerIQ</h1>

      <input
        placeholder="Enter skills"
        value={skills}
        onChange={(e) => setSkills(e.target.value)}
      />

      <button onClick={handleClick}>
        Get Career
      </button>

      {data && (
        <div>
          <h2>Careers</h2>

          {data.careers.map((c, i) => (
            <CareerCard key={i} title={c} />
          ))}

          <h3>Score: {data.score}%</h3>
        </div>
      )}

    </div>
  );
}

export default App;
