const Assignment = ({ isQuestion, details }) => {
  function replaceAll(str, find, replace) {
    return str.replace(new RegExp(find, "g"), replace);
  }

  const regex = /`([^`]+)`/g;
  const matches = details.match(regex);
  if (matches) {
    matches.forEach((match) => {
      const newMatch = replaceAll(match, "`", "");
      details = details.replace(
        match,
        `<code class="language-unknown">${newMatch}</code>`
      );
    });
  }

  return (
    <>
      {isQuestion ? (
        <div className="question">
          <p
            dangerouslySetInnerHTML={{ __html: details }}
            className="bg-purple-900 px-3 py-1 rounded-[4px]"
          ></p>
        </div>
      ) : (
        <div className="answer">
          <p
            dangerouslySetInnerHTML={{ __html: details }}
            className="bg-green-900 px-3 py-1  rounded-[4px]"
          ></p>
        </div>
      )}
    </>
  );
};

export default Assignment;
